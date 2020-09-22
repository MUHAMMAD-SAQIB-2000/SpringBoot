package com.movies.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.movies.main.service.SeasonService;

@Controller
public class SeasonController {
	
	@Autowired
	private SeasonService seasonService;
	
	@GetMapping("/seasons")
	public ModelAndView allSeasons(){
		ModelAndView mav = new ModelAndView("seasons.html");
		mav.addObject("seasons", seasonService.allSeasons());
		return mav;
	}
}
