package com.webdevelopment.ModuleThree;

public class ModuleThreeController {
	
}
/**
 *import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
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

import com.webdevelopment.ModuleFour.EventRepository;
import com.webdevelopment.ModuleFour.EventType;
import com.webdevelopment.ModuleTwo.Event;


@SuppressWarnings("unused")
@Controller
public class ModuleThreeController {
	
	@Autowired
	private EventRepository eventRepository;
	
	@GetMapping("/createEvent")
	public ModelAndView renderCreateEvent() {
		ModelAndView mav = new ModelAndView("createEvent");
		mav.addObject(new Event());
		Set<EventType> allEnums = EnumSet.complementOf(EnumSet.of(EventType.NOTDEFINED));
		mav.addObject("types" , allEnums);
		return mav;
	}
	
	@PostMapping("/createEvent")
	public String displayCreateEvent(@ModelAttribute @Valid Event newEvent, BindingResult bindingResult , Model model) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("errorMsg", "Data Not Correctly Inputted");
			return "redirect:createEvent";
		}
		if(newEvent.getType()==null) {
			newEvent.setType(null);
			eventRepository.save(newEvent);
		}
		eventRepository.save(newEvent);
		//EventData.addOne(newEvent);
		return "redirect:displayEvent";
	}
	
	@GetMapping("/displayEvent")
	public ModelAndView displayEvent() {
		ModelAndView mav = new ModelAndView("displayEvent");
		List<Event> eventEnum = eventRepository.findAll();
		for(Event event: eventEnum) {
			if(event.getType()==null) {
				event.setType(EventType.NOTDEFINED);
				eventRepository.save(event);
			}
		}
		mav.addObject("events" , eventEnum);
		//mav.addObject("events", EventData.getAll());
		return mav;
	}
	
	@GetMapping("/deleteEvent")
	public ModelAndView deleteEventForm() {
		ModelAndView mav = new ModelAndView("deleteEvent");
		mav.addObject("events" , eventRepository.findAll());
		//mav.addObject("events", EventData.getAll());
		return mav;
	}
	
	@PostMapping("/deleteEvent")
	public String displayDeleteEventForm(@RequestParam(required = false) int[] eventIds) {
		if(eventIds != null) {
			for(int id : eventIds) {
				eventRepository.deleteById(id);
				//EventData.deleteOne(id);
			}
		}
		return "redirect:displayEvent";
	}
}
 
 */
