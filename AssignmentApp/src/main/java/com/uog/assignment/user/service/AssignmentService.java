package com.uog.assignment.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uog.assignment.user.entity.Assignment;
import com.uog.assignment.user.entity.Student;
import com.uog.assignment.user.repository.AssignmentRepository;
import com.uog.assignment.user.repository.StudentRepository;

@SuppressWarnings("unused")
@Service
public class AssignmentService {
	
	@Autowired
	private AssignmentRepository assignmentRepository;
	
	@Autowired
	private StudentRepository studentRepository; 
	
	public Assignment saveOne(Assignment assignment) {
		return assignmentRepository.save(assignment);
	}
	
	public List<Assignment> getAssignmentByRollNumber(String rollNumber){
		Student student = studentRepository.findByStudentRollNumber(rollNumber);
		if(student.getStudentRollNumber()==rollNumber) {
			
		}
		
		return assignmentRepository.findAll();
	}
	
	public Assignment getById(int id) {
		return assignmentRepository.findById(id).orElse(null);
	}
	
	public List<Assignment> getAll() {
		return assignmentRepository.findAll();
	}
	
	public void deleteByAssignment(Assignment assignment) {
		assignmentRepository.delete(assignment);
	}
	
	private Student getRollNumber() {
		Assignment assignment = new Assignment();
		Student student= new Student();
		if(student.getStudentRollNumber()== assignment.getStudentRollNumber()) {
			
		}
		return student;
	}
	
	
}
