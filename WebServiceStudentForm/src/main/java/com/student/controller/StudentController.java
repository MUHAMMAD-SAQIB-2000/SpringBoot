package com.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.model.Student;
import com.student.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value= {"" , "/"})
	public String home() {
		return "index.html";
	}
	
	@GetMapping("/register")
	public String saveStudent(Model model) {
		model.addAttribute("student", new Student());
		return "registrationForm.html";
	}
	
	@PostMapping("/register")
	public String saveStudentDBO(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "registrationForm.html";
	}
	
	
	
}
