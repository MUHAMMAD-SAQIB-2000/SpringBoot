package com.uog.assignment.user.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("unused")
@Entity
@Table(name="course")
public class Course extends AbstractUser{
	
	@Column(name = "courseDetails")
	@NotNull
	private String courseDetails;
	
	@OneToMany(mappedBy = "studentCourse")
	private final List<Student> students = new ArrayList<Student>();
	
	@OneToMany(mappedBy = "courses")
	private final List<Assignment> assignments = new ArrayList<Assignment>();

	public Course(@NotNull String courseDetails ) {
		this.courseDetails = courseDetails;
	}
	
	public Course() {}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	
	
	
	
	

}
