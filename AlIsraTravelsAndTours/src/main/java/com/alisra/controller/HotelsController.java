package com.alisra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alisra.entity.Hotels;
import com.alisra.service.HotelsService;

@Controller
public class HotelsController {

	@Autowired
	private HotelsService hotelsService;
	
	@GetMapping("/hotels")
	public ModelAndView addHotelForm() {
		ModelAndView mav = new ModelAndView("hotels.html");
		mav.addObject("hotel", new Hotels());
		mav.addObject("allHotels", hotelsService.getAll());
		return mav;
	}
	
	@PostMapping("/hotels")
	public ModelAndView addHotelFormSave(@ModelAttribute("hotel") Hotels hotel) {
		ModelAndView mav = new ModelAndView("hotels.html");
		hotelsService.add(hotel);
		mav.setViewName("redirect:/hotels");
		return mav;
	}
	
	
}
