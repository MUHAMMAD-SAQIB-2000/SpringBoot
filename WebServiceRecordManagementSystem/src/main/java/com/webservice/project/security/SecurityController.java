package com.webservice.project.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@Controller
public class SecurityController {
	
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logout() {
		return "logout.jsp";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h2>welcome user</h2>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "welcome admin";
	}
	

}
