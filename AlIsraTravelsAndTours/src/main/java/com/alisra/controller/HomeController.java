package com.alisra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@GetMapping(value={"","/" ,"home"})
	public static ModelAndView home() {
		ModelAndView mav = new ModelAndView("index.html");
		return mav;
	}
	
//	@GetMapping("/ContactUs")
//	public static ModelAndView contact() {
//		ModelAndView mav = new ModelAndView("contact.html");
//		return mav;
//	}
	
	@GetMapping("/AboutUs")
	public static ModelAndView about() {
		ModelAndView mav = new ModelAndView("about.html");
		return mav;
	}

}
