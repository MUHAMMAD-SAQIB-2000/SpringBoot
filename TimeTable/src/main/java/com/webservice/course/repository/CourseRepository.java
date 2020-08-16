package com.webservice.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.course.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
