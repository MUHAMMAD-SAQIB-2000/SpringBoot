package com.movies.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.movies.main.service.EpisodeService;

@Controller
public class EpisodeController {
	
	@Autowired
	private EpisodeService episodeService;
	
	@GetMapping("/watchEpisode/{Id}")
	public ModelAndView getEpisodeVideo(@PathVariable("Id") Integer Id) {
		ModelAndView mav = new ModelAndView("watchEpisode.html");
		mav.addObject("episode", episodeService.getEpisode(Id));
		return mav;
	}

}
