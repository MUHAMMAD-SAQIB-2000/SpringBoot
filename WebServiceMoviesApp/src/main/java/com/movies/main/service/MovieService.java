package com.movies.main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.main.entity.Movie;
import com.movies.main.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public Movie getByName(String movieName){
		Movie movieByName =  movieRepository.findByMovieName(movieName).stream()
							.filter(movie -> movie.getMovieName().equals(movieName))
							.findFirst()
							.orElse(null);
		return movieByName;
	}
	
	public List<Movie> getAll(){
		return movieRepository.findAll();
	}
	
	public List<Movie> getByYear(Long releaseYear){
		List<Movie> movieByYear = movieRepository.findAll().stream()
				.filter(movie -> movie.getMovieReleaseYear().equals(releaseYear))
				.collect(Collectors.toList());
		return movieByYear;
	}
}
