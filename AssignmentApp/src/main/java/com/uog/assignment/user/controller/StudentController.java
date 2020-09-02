package com.uog.assignment.user.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uog.assignment.user.entity.Student;
import com.uog.assignment.user.repository.CourseRepository;
import com.uog.assignment.user.repository.StudentRepository;
import com.uog.assignment.user.service.AssignmentService;
import com.uog.assignment.user.service.CourseService;
import com.uog.assignment.user.service.StudentService;

@SuppressWarnings("unused")
@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired 
	private CourseService courseService;
	@Autowired 
	private AssignmentService assignmentService;
	
		
	@GetMapping("/addStudent")
	public ModelAndView renderAddStudent() {
		ModelAndView mav = new ModelAndView("student/addStudent");
		mav.addObject(new Student());
		mav.addObject("courses" , courseService.showAll());
		mav.addObject("assignments" , assignmentService.getAll());
		return mav;
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute @Valid Student student , BindingResult bindingResult , Model model) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("errorMsg", "Data Not Correctly Inputted");
		}
		studentService.saveStudent(student);
		return "redirect:/displayStudent";
	}
	
	@GetMapping("/displayStudent")
	public ModelAndView displayEvent() {
		ModelAndView mav = new ModelAndView("student/displayStudent");
		mav.addObject("students" , studentService.showAll());
		return mav;
	}	

	@GetMapping("/edit/{studentId}")
	public String renderUpdateStudentForm(@PathVariable("studentId") int studentId , Model model) {
		Student student = studentService.getById(studentId);
		if(student == null) {
			throw new RuntimeException("Student with id ="+ studentId + " is not found!!!");
		}
		model.addAttribute("student", student);
		model.addAttribute("courses" , courseService.showAll());
		model.addAttribute("assignments" , courseService.showAll());
		
		return "student/updateStudent";
	}
	
	@PostMapping("/updateStudent/{id}")
	public String updateUser(@PathVariable("id") int id,@ModelAttribute @Valid Student student, BindingResult bindingResult, Model model) {
	    if (bindingResult.hasErrors()) {
	        return "updateStudent";
	    }
	    studentService.Update(student);
	    model.addAttribute("students", studentService.showAll());
        return "redirect:/displayStudent";
	}
	
	@GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int studentId, Model model) {
		Student student = studentService.getById(studentId);
		if(student == null) {
			throw new RuntimeException("Student with id ="+ studentId + " is not found!!!");
		}
        studentService.deleteByUser(student);
        model.addAttribute("students", studentService.showAll());
        return "redirect:/displayStudent";
    }
	
	
}
