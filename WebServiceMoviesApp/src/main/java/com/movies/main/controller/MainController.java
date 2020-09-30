package com.movies.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping("/error")
	public ModelAndView error() {
		ModelAndView mav = new ModelAndView("error.html");
		mav.addObject("error", "Not Found! 404 ERROR!!!");
		return mav;
	}
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home.html");
		return mav;
	}
	
}
