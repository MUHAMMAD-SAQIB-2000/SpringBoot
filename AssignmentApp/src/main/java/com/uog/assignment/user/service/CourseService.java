package com.uog.assignment.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uog.assignment.user.entity.Course;
import com.uog.assignment.user.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> showAll(){
		return courseRepository.findAll();
	}

}
