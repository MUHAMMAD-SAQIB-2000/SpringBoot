package com.webservice.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.course.entity.Course;
import com.webservice.course.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public Course saveOne(Course course) {
		return courseRepository.save(course);
	}
	
	public List<Course> saveOne(List<Course> courses) {
		return courseRepository.saveAll(courses);
	}
	
	public List<Course> getAll() {
		return courseRepository.findAll();
	}
	
	public Course getOne(int id) {
		return courseRepository.findById(id).orElse(null);
	}
	
	public void deleteOne(int id) {
		courseRepository.deleteById(id);
	}
	
	public Course updateCourse(Course course) {
		Course existingCourse = courseRepository.findById(course.getCOURSE_ID()).orElse(null);
		existingCourse.setCOURSE_TITLE(course.getCOURSE_TITLE());
		existingCourse.setCOURSE_DESC(course.getCOURSE_DESC());
		existingCourse.setCOURSE_CODE(course.getCOURSE_CODE());
		existingCourse.setCOURSE_CREDITHOUR(course.getCOURSE_CREDITHOUR());
		existingCourse.setCOURSE_PREREQUIST(course.getCOURSE_PREREQUIST());
		return courseRepository.save(existingCourse);
	}
	
	
	
	
	
	
	
	
}
