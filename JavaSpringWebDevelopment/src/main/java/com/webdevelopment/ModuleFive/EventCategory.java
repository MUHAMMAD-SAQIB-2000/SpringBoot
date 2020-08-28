package com.webdevelopment.ModuleFive;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.webdevelopment.ModuleTwo.Event;

@Entity
public class EventCategory extends AbstractEntity{
	
	@NotBlank(message="Name Is Required")
	@Size(min = 3 , max = 50 , message="Name should be between 3 and 50 Characters")
	private String name;
	
	@OneToMany(mappedBy = "eventCategory")
	private final List<Event> events = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Event> getEvents() {
		return events;
	}
	
	public EventCategory(
			@NotBlank(message = "Name Is Required") @Size(min = 3, max = 50, message = "Name should be between 3 and 50 Characters") String name) {
		this.name = name;
	}
	public EventCategory() {}
	
	@Override
	public String toString() {
		return "EventCategory [name=" + name + "]";
	}

	
}
