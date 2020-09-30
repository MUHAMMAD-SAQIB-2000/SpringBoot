package com.movies.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.movies.main.entity.Movie;
import com.movies.main.service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/watchMovie/{movieName}")
	public ModelAndView getMovieByName(@PathVariable(required = false , value="movieName") String movieName){
		ModelAndView mav = new ModelAndView("watchMovie.html");
		Movie movie = movieService.getByName(movieName);
		if(movie!=null) {
			mav.addObject("movie" , movie);
		}
		else {
			ModelAndView error = new ModelAndView("error.html");
			error.addObject("error", "Not Found");
			return error;
		}
		
		return mav;
	}
	
	@GetMapping(value={"/movies"})
	public ModelAndView getAllMovies(){
		ModelAndView mav = new ModelAndView("allMovies.html");
		mav.addObject("movies" , movieService.getAll());
		return mav;
	}
	
	@GetMapping("/moviesByYear/{releaseYear}")
	public ModelAndView getMovieByYear(@PathVariable(required = false , value="releaseYear") Long releaseYear){
		ModelAndView mav = new ModelAndView("allMovies.html");
		mav.addObject("movies" , movieService.getByYear(releaseYear));
		return mav;
	}
}
