package com.webdevelopment.ModuleTwo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("unused")
@Controller
public class ModuleTwoController {
	
	private static List<Event> events = new ArrayList<>();
	
	@GetMapping(value = {"/" , "/home"} )
	public String home() {
		return "home";
	}
	
	
	/**
		@PostMapping("/createEvent")
		public ModelAndView createEvent(@RequestParam String eventName , @RequestParam String eventDescription) {
			ModelAndView mav = new ModelAndView("createEvent");
			events.add(new Event(eventName , eventDescription));
			return mav;
		}
	
	 *
			 * @GetMapping("/displayEvent")
			public ModelAndView displayEvent() {
				ModelAndView mav = new ModelAndView("displayEvent");
				mav.addObject("events", events);
				return mav;
			}
	 * @return
	 */
	
}
