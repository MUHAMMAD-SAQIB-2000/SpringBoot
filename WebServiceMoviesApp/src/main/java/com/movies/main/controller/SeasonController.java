package com.movies.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.movies.main.entity.Episode;
import com.movies.main.service.EpisodeService;
import com.movies.main.service.SeasonService;

@Controller
public class SeasonController {
	
	@Autowired
	private SeasonService seasonService;
	
	@Autowired
	private EpisodeService episodeService;
	
	@GetMapping("/seasons")
	public ModelAndView allSeasons(){
		ModelAndView mav = new ModelAndView("seasons.html");
		mav.addObject("seasons", seasonService.allSeasons());
		return mav;
	}
	
	@GetMapping("/watchSeason/{Id}")
	public ModelAndView watchSeason(@PathVariable(required = false , value="Id") Integer Id){
		ModelAndView mav = new ModelAndView("watchSeason.html");
		List<Episode> episodes = episodeService.getAllEpisodes(Id);
		mav.addObject("seasons", seasonService.findSeason(Id));
		mav.addObject("episodes", episodes);
		return mav;
	}
}
 