package com.thymeleaf.practice.model;

public class Event {
	private int id ;
	private static int nextId = 1;
	private String name;
	private String desc;
	
	public Event(String name, String desc ) {
		this.name = name;
		this.desc = desc;
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
