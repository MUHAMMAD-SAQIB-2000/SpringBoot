package com.hibernate.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
	
	private int ALIEN_ID;
	private String ALIEN_NAME;
	private String ALIEN_TECH;
	
	@Autowired
	@Qualifier("lap")
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println("In Constructor of aliens");
	}

	public int getALIEN_ID() {
		return ALIEN_ID;
	}

	public void setALIEN_ID(int aLIEN_ID) {
		ALIEN_ID = aLIEN_ID;
	}

	public String getALIEN_NAME() {
		return ALIEN_NAME;
	}

	public void setALIEN_NAME(String aLIEN_NAME) {
		ALIEN_NAME = aLIEN_NAME;
	}

	public String getALIEN_TECH() {
		return ALIEN_TECH;
	}

	public void setALIEN_TECH(String aLIEN_TECH) {
		ALIEN_TECH = aLIEN_TECH;
	}
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		System.out.println("Will my method execute?");
		laptop.complie();
	}

	
	
	
}
