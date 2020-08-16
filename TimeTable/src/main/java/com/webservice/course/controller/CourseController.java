package com.webservice.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.course.service.CourseService;
import com.webservice.course.entity.Course;
import com.webservice.course.repository.CourseRepository;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@RequestMapping("/course")
	public String inCourse() {
		return "In Course Controller of timetable webservice project!!! ";
	}
	
	@PostMapping("/course/saveOneCourse/noPreReq")//Done
	public Course saveOneCourse(@RequestBody Course course ) {
		return courseService.saveOne(course);
	}
	
	@PostMapping("/course/{courseId}/saveOneCourse/withPreReq")//Done
	public Course saveOneCourse(@RequestBody Course course ,@PathVariable int courseId) {
		course.setCOURSE_PREREQUIST(courseRepository.findById(courseId).orElse(null));
		return courseService.saveOne(course);
	}
	
	@PostMapping("/course/saveManyCourses")
	public List<Course> saveManyCourse(@RequestBody List<Course> courses) {
		return courseService.saveOne(courses);
	}
	
	@GetMapping("/course/displayAllCourses")//Done
	public List<Course> displayAllCourses() {
		return courseService.getAll();
	}
	
	@GetMapping("/course/displayOneCourse/{id}")
	public Course displayOneCourse(@PathVariable int id) {
		return courseService.getOne(id);
	}
	
	@PutMapping("/course/{courseId}/course/updateCourse/{id}")
	public Course updateOneCourse(@RequestBody Course course , @PathVariable int courseId) {
		course.setCOURSE_PREREQUIST(courseRepository.findById(courseId).orElse(null));
		return courseService.updateCourse(course);
	}
	
	@PutMapping("course/updateCourse")
	public Course updateOneCourse(@RequestBody Course course ) {
		return courseService.updateCourse(course);
	}
	
	@DeleteMapping("/course/deleteOneCourse/{id}")//Done
	public String deleteOneCourse(@PathVariable int id) {
		courseService.deleteOne(id);
		return "Course with Requested ID= " + id + " has been deleted!!" ;
	}
}
