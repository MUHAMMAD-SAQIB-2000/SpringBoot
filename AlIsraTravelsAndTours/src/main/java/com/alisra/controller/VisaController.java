package com.alisra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alisra.entity.Visa;
import com.alisra.service.VisaService;

@Controller
public class VisaController {
	
	@Autowired
	private VisaService service;
	
	@GetMapping("/addVisa")
	public ModelAndView addVisaForm() {
		ModelAndView mav = new ModelAndView("addVisa.html");
		mav.addObject("newVisa", new Visa());
		return mav;
	}
	
	@PostMapping("/addVisa")
	public ModelAndView addVisaFormDataSave(@ModelAttribute("visa") Visa visa) {
		ModelAndView mav = new ModelAndView();
		service.addVisa(visa);
		mav.setViewName("redirect:/All-Visas");
		return mav;
	}
	
	@GetMapping("/All-Visas")
	public ModelAndView displayVisa() {
		ModelAndView mav = new ModelAndView("allVisas.html");
		mav.addObject("allVisas", service.getAll());
		return mav;
	}

}
///webjars/font-awesome/5.8.2/css/fontawesome.min.css