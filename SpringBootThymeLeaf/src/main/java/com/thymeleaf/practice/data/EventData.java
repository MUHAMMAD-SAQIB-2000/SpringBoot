package com.thymeleaf.practice.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.thymeleaf.practice.model.Event;

public class EventData {
	
	private static final Map<Integer, Event> events = new HashMap<>();
	
	public static Collection<Event> getAll(){
		return events.values();
	}
	
	public static Event getById(int id) {
		return events.get(id);
	}
	
	public static void add(Event event) {
		events.put(event.getId(), event);
	}
	
	public static Event del(int id) {
		return events.remove(id);
	}
}
