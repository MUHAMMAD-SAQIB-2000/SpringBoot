package com.hibernate.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("unused")
@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView home(Aliens aliens) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", aliens);
		
		mv.setViewName("home");
		
		return mv;
	}
	
	
	
	
	
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myName) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", myName);
//		mv.setViewName("home");
//		System.out.println("Hi! " + myName );
//		return mv;
//	}
	
	
//	@RequestMapping("Home")
//	public String home(@RequestParam("name") String myName, HttpSession session ) {
//		
//		System.out.println("Hi! " + myName );
//		session.setAttribute("name", myName);
//		return "home";
//	}
}
