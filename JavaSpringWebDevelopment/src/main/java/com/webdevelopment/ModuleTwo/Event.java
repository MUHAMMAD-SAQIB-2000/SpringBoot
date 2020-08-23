package com.webdevelopment.ModuleTwo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class Event {
	
	private int id;
	private static int nextId = 1;
	
	@NotBlank
	@NotNull
	@Size(min = 3 , max = 50 , message="Name should be between 3 and 50 Characters")
	private String name;
	
	@Size(max = 500 , message="Description too Long!. Max character Limit 500!!!")
	private String description;
	
	@Email(message="Email format not corrent or invalid email. Try Again")
	private String contactEmail;
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
	
	public int getId() {
		return id;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Event() {
	}
	
	public Event(String name, String description , String  contactEmail) {
		this.name = name;
		this.description = description;
		this.contactEmail = contactEmail;
		this.id = nextId;
		nextId++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
