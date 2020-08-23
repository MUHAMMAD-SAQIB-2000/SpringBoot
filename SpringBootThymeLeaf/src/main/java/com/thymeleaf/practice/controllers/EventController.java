package com.thymeleaf.practice.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	@PostMapping("/create")
	public String createEvent(@RequestParam @Valid String eventName , @RequestParam @Valid String  eventDesc ,
							  @RequestParam @Valid String  eventContactEmail , Errors errors , Model model) {
		if(errors.hasErrors()) {
			return "creatr";
		}
		EventData.add(new Event(eventName  , eventDesc , eventContactEmail ));
		return "redirect:/event";
	}
	
	@GetMapping("/event")
	public String event(Model model) { 
		model.addAttribute("events", EventData.getAll());
		return "event";
	}
	
	@GetMapping("/deleteEvent")
	public ModelAndView deleteEventForm() {
		ModelAndView mav = new ModelAndView("deleteEvent");
		mav.addObject("events", EventData.getAll());
		return mav;
	}
	
	@PostMapping("/deleteEvent")
	public String displayDeleteEventForm(@RequestParam(required = false) int[] eventIds) {
		if(eventIds != null) {
			for(int id : eventIds) {
				EventData.del(id);
			}
		}
		
		return "redirect:event";
	}
}

