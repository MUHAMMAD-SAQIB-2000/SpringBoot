package com.uog.assignment.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SuppressWarnings("unused")
@Controller
public class MainController {
	
	@GetMapping(value={"/" , "/home"})
	public String home() {
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "security/Login";
	}
	
	@GetMapping("/error")
	public String error() {
		return "error/error";
	}
}

