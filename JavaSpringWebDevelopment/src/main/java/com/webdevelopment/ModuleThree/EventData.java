package com.webdevelopment.ModuleThree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.webdevelopment.ModuleTwo.Event;

public class EventData {
	
	private static final Map<Integer, Event> events = new HashMap<Integer, Event>();
	
	public static Collection<Event> getAll(){
		return events.values();
	}
	
	public static Event getById(int id) {
		return events.get(id);
	}
	
	public static void addOne(Event event) {
		//event.setId(events.size()+1);
		events.put(event.getId(), event);
	}
	
	public static void deleteOne(int id) {
		events.remove(id);
	}
	
}
