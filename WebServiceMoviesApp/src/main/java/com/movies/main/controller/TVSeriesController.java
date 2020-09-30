package com.movies.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.movies.main.entity.Season;
import com.movies.main.entity.TVSeries;
import com.movies.main.service.SeasonService;
import com.movies.main.service.TVSeriesService;

@Controller
public class TVSeriesController {
	
	@Autowired
	private TVSeriesService tvSeriesService;
	
	@Autowired
	private SeasonService seasonService;
	
	
	@GetMapping("/watchSeries/{tvSeriesName}")
	public ModelAndView getTVSeriesByName(@PathVariable(required = false , value="tvSeriesName") String tvSeriesName){
		ModelAndView mav = new ModelAndView("watchTVSeries.html");
		TVSeries tvSeries = tvSeriesService.getByName(tvSeriesName);
		if(tvSeries!=null) {
			mav.addObject("tvSeries" , tvSeries);
		}
		else {
			ModelAndView error = new ModelAndView("error.html");
			error.addObject("error", "Not Found");
			return error;
		}
		
		return mav;
	}
	
	@GetMapping("/series/{Id}")
	public ModelAndView getTVSeriesDetails(@PathVariable(required = false , value="Id") Integer Id){
		ModelAndView mav = new ModelAndView("watchTVSeries.html");
		TVSeries tvSeries = tvSeriesService.getById(Id);
		List<Season> seasons = seasonService.home(tvSeries);
		if(tvSeries!=null && seasons!=null) {
			mav.addObject("tvSeries" , tvSeries);
			mav.addObject("seasons", seasons);
		}
		else {
			ModelAndView error = new ModelAndView("error.html");
			error.addObject("error", "Not Found");
			return error;
		}
		return mav;
	}
	
	@GetMapping(value={"/tvseries"})
	public ModelAndView getAllTVSeries(){
		ModelAndView mav = new ModelAndView("allTVSeries.html");
		mav.addObject("tvSeries" , tvSeriesService.getAll());
		return mav;
	}
	

}
