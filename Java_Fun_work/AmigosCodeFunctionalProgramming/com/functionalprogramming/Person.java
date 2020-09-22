package com.functionalprogramming;

public class Person {
	
	private String personName;
	private Gender gender;
		
	public Person(String personName, Gender gender) {
		this.personName = personName;
		this.gender = gender;
	}
	
	public Person() {
	}

	public String getPersonName() {
		return personName;
	}
	public Gender getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", gender=" + gender + "]";
	}
	
	
	

}
