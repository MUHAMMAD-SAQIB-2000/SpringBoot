package com.thymeleaf.practice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thymeleaf.practice.data.EventData;
import com.thymeleaf.practice.model.Event;

@SuppressWarnings("unused")
@Controller
public class EventController {

	@GetMapping("/home")
	public String home() {
		return "hello";
	}
	
	@GetMapping("/create")
	public String create() {
		return "creatr";
	}
	
	@GetMapping("/event")
	public String event(Model model) { 
		model.addAttribute("events", EventData.getAll());
		return "event";
	}
	
	@PostMapping("/create")
	public String createEvent(@RequestParam String eventName , @RequestParam String  eventDesc ) {
		EventData.add(new Event(eventName  , eventDesc ));
		return "redirect:/event";
	}
}

