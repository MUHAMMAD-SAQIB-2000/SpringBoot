package com.thymeleaf.practice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping
	public String home() {
		return "hello";
	}
	
	@RequestMapping(method= {RequestMethod.GET , RequestMethod.POST }, value="/hello")
	public String name(@RequestParam String name , Model model) {
		String greetMsg="Hello, " + name + "!!";
		model.addAttribute("greetings" , greetMsg);
		return "hello";
	}
	
	@GetMapping("/hello/{name}")
	@ResponseBody
	public String nameWithParam(@PathVariable String name, Model model) {
		String greetMsg="Hello, " + name + "!!";
		model.addAttribute("greetings" , greetMsg);
		return "hello";
	}
	@GetMapping("/form")
	public String formHTML() {
		return "form";	
	}

	@GetMapping("/hello-names")
	public String formHTML(Model model) {
		List<String> names = new ArrayList<>();
		names.add("Saqib");
		names.add("Maida");
		names.add("Minahil");
		model.addAttribute("names", names);
		return "hello-list";	
	}
}
