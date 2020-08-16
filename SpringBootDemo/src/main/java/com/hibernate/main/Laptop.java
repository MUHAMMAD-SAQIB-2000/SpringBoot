package com.hibernate.main;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {
	private int LAPTOP_ID;
	private String LAPTOP_BRAND;
	
	public int getLAPTOP_ID() {
		return LAPTOP_ID;
	}

	public void setLAPTOP_ID(int lAPTOP_ID) {
		LAPTOP_ID = lAPTOP_ID;
	}

	public String getLAPTOP_BRAND() {
		return LAPTOP_BRAND;
	}

	public void setLAPTOP_BRAND(String lAPTOP_BRAND) {
		LAPTOP_BRAND = lAPTOP_BRAND;
	}

	public String toString() {
		return "Laptop [Laptop Id = " + LAPTOP_ID + " Brand = " + LAPTOP_BRAND + "]";
	}
	
	public void complie() {
		System.out.println("Compiling Code......");
		
	}
}
