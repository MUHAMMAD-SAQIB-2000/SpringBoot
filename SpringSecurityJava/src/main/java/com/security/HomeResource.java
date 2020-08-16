package com.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@RequestMapping("/home")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	@RequestMapping("/user")
	public String user() {
		return ("<h1>Welcome user</h1>");
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return ("<h1>Welcome admin</h1>");
	}

}
