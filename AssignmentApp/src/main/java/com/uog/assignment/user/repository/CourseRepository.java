package com.uog.assignment.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uog.assignment.user.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
