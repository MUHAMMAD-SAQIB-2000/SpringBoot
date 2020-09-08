package com.amogoscode.entity;

public class Person {

	private int age;
	private String name;
	private final Gender gender;
	
	public Person() {
		this.gender = null;
	}
	
	public Person(int age, String name ,Gender gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}
