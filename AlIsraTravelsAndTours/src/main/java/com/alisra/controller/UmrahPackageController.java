package com.alisra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alisra.entity.UmrahPackage;
import com.alisra.service.UmrahPackageService;

@Controller
//@RequestMapping("/umrah")
public class UmrahPackageController {

	@Autowired
	private UmrahPackageService service;
	
	@GetMapping("/Umrah-Details-Add")
	public ModelAndView addUmrahForm() {
		ModelAndView mav = new ModelAndView("addUmrahPackage.html");
		mav.addObject("umrah", new UmrahPackage());
		return mav;
	}
	
	@PostMapping("/Umrah-Details-Add")
	public ModelAndView addUmrahFormSave(@ModelAttribute("umrahPackage") UmrahPackage umrahPackage) {
		ModelAndView mav = new ModelAndView("addUmrahPackage.html");
		service.add(umrahPackage);
		mav.setViewName("redirect:/All-Umrah-Packages");
		return mav;
	}
	
	@GetMapping("/All-Umrah-Packages")
	public ModelAndView getAll() {
		ModelAndView mav = new ModelAndView("allUmrahPackage.html");
		mav.addObject("allUmrahPackage", service.getAll());
		return mav;
	}
	
}
