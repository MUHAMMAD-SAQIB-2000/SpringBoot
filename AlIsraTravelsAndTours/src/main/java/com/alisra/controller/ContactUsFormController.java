package com.alisra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alisra.entity.ContactUsForm;
import com.alisra.service.ContactUsFormService;

@Controller
public class ContactUsFormController {

	@Autowired
	private ContactUsFormService contactUsFormService;
	
	@GetMapping("/ContactUs")
	public ModelAndView contactFormDisplay() {
		ModelAndView mav = new ModelAndView("contact.html");
		mav.addObject("ContactUsForm", new ContactUsForm());
		return mav;
	}
	
	@PostMapping("/ContactUs")
	public ModelAndView contactFormDisplaySave(@ModelAttribute(value="response" )  ContactUsForm response) {
		ModelAndView mav = new ModelAndView();
		contactUsFormService.addResponse(response);
		mav.setViewName("redirect:/ContactUs");
		return mav;
	}
	
}
