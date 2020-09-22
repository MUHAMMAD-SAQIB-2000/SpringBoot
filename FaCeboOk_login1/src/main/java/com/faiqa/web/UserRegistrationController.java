package com.faiqa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.faiqa.model.User;
import com.faiqa.service.UserService;

@RestController
@RequestMapping("/registration")
public class UserRegistrationController {

	@Autowired
	private UserService service;

	//to handle the html file for this create handler method
	@GetMapping
	public ModelAndView renderCreateUser() {
		ModelAndView mav = new ModelAndView("registration.html");
		mav.addObject("user" , new User());
		return mav;
	}

	@PostMapping
	public ModelAndView displayCreateEvent(@ModelAttribute("newUser") User newUser) {
		ModelAndView mav = new ModelAndView("registration");
		service.save(newUser);
		mav.setViewName("redirect:/registration?success");
		return mav;
	}
}
