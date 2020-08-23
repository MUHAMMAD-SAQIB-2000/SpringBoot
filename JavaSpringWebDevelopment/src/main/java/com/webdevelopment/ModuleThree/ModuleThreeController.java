package com.webdevelopment.ModuleThree;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.webdevelopment.ModuleTwo.Event;

@SuppressWarnings("unused")
@Controller
public class ModuleThreeController {
	
	@PostMapping("/createEvent")
	public ModelAndView displayCreateEvent(@RequestParam @Valid String eventName , @RequestParam @Valid String eventDescription ,
											@RequestParam @Valid String eventContactEmail) {
		ModelAndView mav = new ModelAndView("createEvent");
		EventData.addOne(new Event(eventName , eventDescription , eventContactEmail));
		return mav;
	}
	/***
	@PostMapping("/createEvent")
	public ModelAndView displayCreateEvent(@ModelAttribute Event newEvent) {
		ModelAndView mav = new ModelAndView("createEvent");
		EventData.addOne(newEvent);
		return mav;
	}**/
	
	@GetMapping("/displayEvent")
	public ModelAndView displayEvent() {
		ModelAndView mav = new ModelAndView("displayEvent");
		mav.addObject("events", EventData.getAll());
		return mav;
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
				EventData.deleteOne(id);
			}
		}
		return "redirect:displayEvent";
	}
}
