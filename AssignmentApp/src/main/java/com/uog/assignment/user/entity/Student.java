package com.uog.assignment.user.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("unused")
@Entity
@Table(name = "student")
public class Student extends AbstractUser{
	
	@NotBlank(message = "Name cannot be empty")
	@Size(min=3, max=30 , message="Name should be 3 to 50 characters")
	@Column(name = "studentName")
	private String studentName;
	
	@NotBlank(message = "Roll Number Cannot be Empty")
	@Column(name = "studentRollNumber")
	private String studentRollNumber;
	
	@NotBlank(message = "Select Your Semester Please")
	@Column(name = "studentSemester")
	private String studentSemester;

	@ManyToOne
	private Course studentCourse;
	
	@ManyToOne
	private Assignment studentAssignment;
	
	public Student(
			String studentName,
			String studentRollNumber,
			String studentSemester, Course studentCourse) {
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
		this.studentSemester = studentSemester;
		this.studentCourse = studentCourse;
	}
	
	public Student() {}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollNumber=" + studentRollNumber + ", studentSemester="
				+ studentSemester + ", studentCourse=" + studentCourse + "]";
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentSemester() {
		return studentSemester;
	}
	public void setStudentSemester(String studentSemester) {
		this.studentSemester = studentSemester;
	}

	public Course getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(Course studentCourse) {
		this.studentCourse = studentCourse;
	}

	public Assignment getStudentAssignment() {
		return studentAssignment;
	}

	public void setStudentAssignment(Assignment studentAssignment) {
		this.studentAssignment = studentAssignment;
	}
	
	
	
	

}
