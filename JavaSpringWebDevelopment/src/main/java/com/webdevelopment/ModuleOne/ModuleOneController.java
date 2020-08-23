package com.webdevelopment.ModuleOne;

import java.util.ArrayList;
import java.util.List;

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
	/**private static List<String> events = new ArrayList<>();
	
	@GetMapping(value = {"/" , "/home"} )
	public String home() {
		return "home";
	}
	
	@GetMapping("/portfolio")
	public String portfolio() {
		return "portfolio";
	}
	
	@GetMapping("/createEvent")
	public String renderCreateEvent() {
		return "createEvent";
	}
	
	@RequestMapping(method = {RequestMethod.POST} ,value = {"/createEvent"} )
	public ModelAndView createEvent(@RequestParam String eventName) {
		ModelAndView mav = new ModelAndView("createEvent");
		events.add(eventName);
		mav.addObject("eventName", eventName);
		return mav;
	}
	
	@RequestMapping(method = {RequestMethod.GET } ,value = {"/displayEvent"} )
	public ModelAndView displayEvent() {
		ModelAndView mav = new ModelAndView("displayEvent");
		mav.addObject("events", events);
		return mav;
	}**/
}
