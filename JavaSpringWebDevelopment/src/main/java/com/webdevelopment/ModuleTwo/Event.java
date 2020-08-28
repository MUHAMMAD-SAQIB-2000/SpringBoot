package com.webdevelopment.ModuleTwo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.webdevelopment.ModuleFive.AbstractEntity;
import com.webdevelopment.ModuleFive.EventCategory;
import com.webdevelopment.ModuleFour.EventType;

@SuppressWarnings("unused")
@Entity
public class Event extends AbstractEntity{
	
	@NotBlank(message="Name Is Required")
	@Size(min = 3 , max = 50 , message="Name should be between 3 and 50 Characters")
	private String name;
	
	@Size(max = 500 , message="Description too Long!. Max character Limit 500!!!")
	private String description;
	
	@NotBlank(message="Email must be entered")
	@Email(message="Email format not corrent or invalid email. Try Again")
	private String contactEmail;
	
	@ManyToOne
	@NotNull(message="It can not be empty")
	private EventCategory eventCategory;
	
	public Event(
			@NotBlank(message = "Name Is Required") @Size(min = 3, max = 50, message = "Name should be between 3 and 50 Characters") String name,
			@Size(max = 500, message = "Description too Long!. Max character Limit 500!!!") String description,
			@NotBlank(message = "Email must be entered") @Email(message = "Email format not corrent or invalid email. Try Again") String contactEmail,
			EventCategory eventCategory) {
		this.name = name;
		this.description = description;
		this.contactEmail = contactEmail;
		this.eventCategory = eventCategory;
	}
	public Event() {}
	
	public EventCategory getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(EventCategory eventCategory) {
		this.eventCategory = eventCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	
	

	
}
/**
 * 			private EventType type;
		public Event(@NotBlank(message = "Name Is Required") @Size(min = 3, max = 50, message = "Name should be between 3 and 50 Characters") String name,
			@Size(max = 500, message = "Description too Long!. Max character Limit 500!!!") String description,
			@NotBlank(message = "Email must be entered") @Email(message = "Email format not corrent or invalid email. Try Again") String contactEmail,
			EventType type) {
		this.name = name;
		this.description = description;
		this.contactEmail = contactEmail;
		this.type = type;
	}
	
	public Event() {}
	
	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}
		
		@Override
	public String toString() {
		return "Event [name=" + name + ", description=" + description + ", contactEmail=" + contactEmail + ", type="
				+ type + "]";
	}
 */
