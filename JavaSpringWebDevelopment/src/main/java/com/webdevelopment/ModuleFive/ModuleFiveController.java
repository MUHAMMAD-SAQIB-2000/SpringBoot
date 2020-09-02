package com.webdevelopment.ModuleFive;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.webdevelopment.ModuleFour.EventCategoryRepository;
import com.webdevelopment.ModuleFour.EventRepository;
import com.webdevelopment.ModuleFour.EventType;
import com.webdevelopment.ModuleTwo.Event;

@SuppressWarnings("unused")
@Controller
public class ModuleFiveController {

	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private EventCategoryRepository eventCategoryRepository;

	@GetMapping("/createEvent")
	public ModelAndView renderCreateEvent() {
		ModelAndView mav = new ModelAndView("createEvent");
		mav.addObject(new Event());
		mav.addObject("categories" , eventCategoryRepository.findAll());
		return mav;
	}

	@PostMapping("/createEvent")
	public String createEventFormDisplay(@ModelAttribute @Valid Event newEvent, BindingResult bindingResult , Model model) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("errorMsg", "Data Not Correctly Inputted");
			return "redirect:createEvent";
		}
		eventRepository.save(newEvent);
		return "redirect:displayEvent";
	}

	@GetMapping("/displayEvent")
	public ModelAndView displayEvent(@RequestParam(required = false) Integer categoryId) {
		ModelAndView mav = new ModelAndView("displayEvent");
		if(categoryId == null) {
			mav.addObject("events" , eventRepository.findAll());
		}else {
			Optional<EventCategory> result =  eventCategoryRepository.findById(categoryId);
			if(result.isPresent()) {
				EventCategory category = result.get();
				mav.addObject("title", "Event with category: " + category.getName());
				mav.addObject("events" , category.getEvents());
			}else {
				mav.addObject("title", "Event with category: ID=" + categoryId + " Not Found ");
				mav.setViewName("/home");
				return mav;
			}
		}
		return mav;
	}
	
	@GetMapping("/displayCategory")
	public String displaycategory(@RequestParam(required = false) Integer categoryId , Model model) {
		model.addAttribute("categories" , eventCategoryRepository.findAll());
		return "displayCategory";
	}

	@GetMapping("/deleteEvent")
	public ModelAndView deleteEventForm() {
		ModelAndView mav = new ModelAndView("deleteEvent");
		mav.addObject("events" , eventRepository.findAll());
		return mav;
	}

	@PostMapping("/deleteEvent")
	public String displayDeleteEventForm(@RequestParam(required = false) int[] eventIds) {
		if(eventIds != null) {
			for(int id : eventIds) {
				eventRepository.deleteById(id);
			}
		}
		return "redirect:displayEvent";
	}
}

