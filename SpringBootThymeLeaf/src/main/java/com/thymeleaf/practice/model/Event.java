package com.thymeleaf.practice.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class Event {
	private int id ;
	private static int nextId = 1;
	
	@NotBlank
	@NotNull
	@Size(min = 3 , max = 50 , message="Name should be between 3 and 50 Characters")
	private String name;
	
	@Size(max = 500 , message="Description too Long!. Max character Limit 500!!!")
	private String desc;
	
	@Email(message="Email format not corrent or invalid email. Try Again")
	private String contactEmail;
	
	public Event(String name, String desc , String  contactEmail) {
		this.name = name;
		this.desc = desc;
		this.contactEmail = contactEmail;
		this.id = nextId;
		nextId++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		return true;
	}	
	
	
	
}
