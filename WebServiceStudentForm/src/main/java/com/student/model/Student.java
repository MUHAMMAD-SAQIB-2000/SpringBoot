package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String studentFirstName;
	
	private String studentLastName;
	 
	private String studentAge;
	
	private String studentGender;
	
	private String studentDateOfBirth;
	
	private String studentBirthPlace;
	
	private String studentCountry;
	
	private String studentRegistrationNumber;
	
	public Student() {}

	public Student(int id, String studentFirstName, String studentLastName, String studentAge, String studentGender,
			String studentBirthPlace, String studentCountry, String studentRegistrationNumber,
			String studentDateOfBirth) {
		this.Id = id;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentAge = studentAge;
		this.studentGender = studentGender;
		this.studentBirthPlace = studentBirthPlace;
		this.studentCountry = studentCountry;
		this.studentRegistrationNumber = studentRegistrationNumber;
		this.studentDateOfBirth = studentDateOfBirth;
	}


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentBirthPlace() {
		return studentBirthPlace;
	}

	public void setStudentBirthPlace(String studentBirthPlace) {
		this.studentBirthPlace = studentBirthPlace;
	}

	public String getStudentCountry() {
		return studentCountry;
	}

	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}

	public String getStudentRegistrationNumber() {
		return studentRegistrationNumber;
	}

	public void setStudentRegistrationNumber(String studentRegistrationNumber) {
		this.studentRegistrationNumber = studentRegistrationNumber;
	}

	public String getStudentDateOfBirth() {
		return studentDateOfBirth;
	}

	public void setStudentDateOfBirth(String studentDateOfBirth) {
		this.studentDateOfBirth = studentDateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", studentFirstName=" + studentFirstName + ", studentLastName=" + studentLastName
				+ ", studentAge=" + studentAge + ", studentGender=" + studentGender + ", studentDateOfBirth="
				+ studentDateOfBirth + ", studentBirthPlace=" + studentBirthPlace + ", studentCountry=" + studentCountry
				+ ", studentRegistrationNumber=" + studentRegistrationNumber + "]";
	}

	
}
