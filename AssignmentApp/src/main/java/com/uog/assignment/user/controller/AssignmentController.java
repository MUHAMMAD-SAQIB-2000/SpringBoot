package com.uog.assignment.user.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uog.assignment.user.entity.Assignment;
import com.uog.assignment.user.entity.Student;
import com.uog.assignment.user.service.AssignmentService;
import com.uog.assignment.user.service.CourseService;

@SuppressWarnings("unused")
@Controller
public class AssignmentController {
	
	@Autowired 
	private CourseService courseService;
	
	@Autowired 
	private AssignmentService assignmentService;
	
	@GetMapping("/addAssignment")
	private ModelAndView renderAddAssignmentForm() {
		ModelAndView mav = new ModelAndView("assignment/addAssignment");
		mav.addObject(new Assignment());
		mav.addObject("courses" , courseService.showAll());
		return mav;
	}
	
	@PostMapping("/addAssignment")
	private String addAssignmentForm(@ModelAttribute("assignment") @Valid Assignment assignment ,
										BindingResult bindingResult , Model model) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("errorMsg", "Data Not Correctly Inputted");
		}
		assignmentService.saveOne(assignment);
		return "redirect:showAssignment";
	}
	
	@GetMapping("/showAssignment")
	public ModelAndView displayEvent() {
		ModelAndView mav = new ModelAndView("assignment/showAssignment");
		mav.addObject("assignments" , assignmentService.getAll());
		return mav;
	}
	
	@GetMapping("/deleteAssignment/{id}")
    public String deleteUser(@PathVariable("id") int assignmentId, Model model) {
		Assignment assignment = assignmentService.getById(assignmentId);
		if(assignment == null) {
			throw new RuntimeException("Student with id ="+ assignmentId + " is not found!!!");
		}
		assignmentService.deleteByAssignment(assignment);
        model.addAttribute("students", assignmentService.getAll());
        return "redirect:/showAssignment";
    }
}
