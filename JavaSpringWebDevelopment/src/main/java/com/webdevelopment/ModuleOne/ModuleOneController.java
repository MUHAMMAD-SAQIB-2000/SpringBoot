package com.webdevelopment.ModuleOne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("unused")
@Controller
public class ModuleOneController {
	
	@GetMapping(value = {"/" , "/home"} )
	public String home() {
		return "home";
	}
	
	@GetMapping(value = {"/portfolio"} )
	public String portfolio() {
		return "portfolio";
	}
	
	@RequestMapping(method = {RequestMethod.GET , RequestMethod.POST} ,value = {"/createEvent"} )
	public ModelAndView createEvent(@RequestParam String eventName) {
		ModelAndView mav = new ModelAndView("createEvent");
		mav.addObject("eventName", eventName);
		return mav;
	}
	
	@RequestMapping(method = {RequestMethod.GET , RequestMethod.POST} ,value = {"/displayEvent"} )
	public ModelAndView displayEvent(@RequestParam String eventName) {
		ModelAndView mav = new ModelAndView("displayEvent");
		mav.addObject("events", eventName);
		return mav;
	}
}
