package com.uog.assignment.user.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name="assignments")
public class Assignment extends AbstractUser{
	
	@Column(name="assignmentName")
	private String assignmentName;
	
	@Column(name="assignmentStartDate")
	private String assignmentStartDate;
	
	@Column(name="assignmentEndDate")
	private String assignmentEndDate;
	
	@ManyToOne
	private Course courses ;
	
	private String studentRollNumber;
	
	public Assignment() {}
		
	public Assignment(String assignmentName, String assignmentStartDate, String assignmentEndDate) {
		this.assignmentName = assignmentName;
		this.assignmentStartDate = assignmentStartDate;
		this.assignmentEndDate = assignmentEndDate;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public String getAssignmentStartDate() {
		return assignmentStartDate;
	}

	public void setAssignmentStartDate(String assignmentStartDate) {
		this.assignmentStartDate = assignmentStartDate;
	}

	public String getAssignmentEndDate() {
		return assignmentEndDate;
	}

	public void setAssignmentEndDate(String assignmentEndDate) {
		this.assignmentEndDate = assignmentEndDate;
	}

	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}

	public String getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	
}
