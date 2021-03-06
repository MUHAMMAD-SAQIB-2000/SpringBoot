package com.webservice.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.webservice.project.entity.Customer;
import com.webservice.project.service.CustomerService;

//@RestController
@SuppressWarnings("unused")
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	//home page
	@RequestMapping(value = {"/" , "/home"} )
	public ModelAndView home() {
		ModelAndView mvc = new ModelAndView("home.html");
		return mvc;
	}
	
	//displaying page data in table
	@RequestMapping(value = {"/displayAllCustomers" } )
	public ModelAndView getRecords() {
		ModelAndView mvc = new ModelAndView("CustomerList.jsp");
		mvc.addObject("list" , customerService.getAll());
		return mvc;
	}
	
	//add data
	@RequestMapping("/addCustomerForm")
	public ModelAndView addRecord() {
		ModelAndView mvc = new ModelAndView("CustomerAdd.jsp");
		mvc.addObject("customer" , new Customer());
		return mvc;
	}
	@RequestMapping("/saveOne")
	public ModelAndView saveOneCustomer(@ModelAttribute("customer") Customer customer) {
		ModelAndView mvc = new ModelAndView("CustomerList.jsp");
		customerService.saveAndUpdate(customer);
		mvc.addObject("list" , customerService.getAll());
		return mvc;
	}	
	
	//delete
	@RequestMapping("/deleteOneRecord")
	public ModelAndView deleteOne(@RequestParam("customerID") int customerID) {
		ModelAndView mvc = new ModelAndView("CustomerList.jsp");
		customerService.deleteOne(customerID);
		mvc.addObject("list" , customerService.getAll());
		return mvc;
	}
	
	//update record
	@RequestMapping("/updateOneCustomerRecord")
	public ModelAndView updateOneCustomer(@RequestParam("customerID") int customerID) {
		ModelAndView mvc = new ModelAndView("CustomerAdd.jsp");
		Customer customer = customerService.getOne(customerID);
		if(customer == null) {
			throw new RuntimeException("Customer with id ="+ customerID + " is not found!!!");
		}
		customerService.saveAndUpdate(customer);
		mvc.addObject("customer" , customer);
		mvc.addObject("list" , customerService.getAll());
		return mvc;
	}

//	@PostMapping("/saveRecord")
//	public List<Customer> saveManyCustomers(@RequestBody List<Customer> customers) {
//		return customerService.saveMany(customers);
//	}
//	
//	@GetMapping("/displayAllCustomers")
//	public List<Customer> getAllCustomers(){
//		return customerService.getAll();
//	}
//	
//	
//	@DeleteMapping("/deleteOneCustomerRecord/{id}")
//	public String deleteOneCustomer(@PathVariable int id) {
//		customerService.deleteOne(id);
//		return "Record with id ="+id+" is deleted";
//	}
//	
//	@PutMapping("/updateOneCustomer")
//	public Customer updateOneCustomer(@RequestBody Customer customer) {
//		return customerService.saveAndUpdate(customer);
//	}

}
