package com.webservice.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.project.entity.Customer;
import com.webservice.project.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> saveMany(List<Customer> customer) {
		return customerRepository.saveAll(customer);
	}
	
	public List<Customer> getAll(){
		return customerRepository.findAll();
	}
	
	public Customer getOne(int id){
		return customerRepository.findById(id).orElse(null);
	}
	
	public void deleteOne(int id) {
		customerRepository.deleteById(id);
	}
	
	public Customer saveAndUpdate(Customer customer) {
		Customer existingCustomer = customerRepository.findById(customer.getCustomerID()).orElse(null);
		if(existingCustomer == null) {
			customerRepository.save(customer);
		}else {
			existingCustomer.setCustomerName(customer.getCustomerName());
			existingCustomer.setCustomerGender(customer.getCustomerGender());
			existingCustomer.setCustomerAge(customer.getCustomerAge());
			existingCustomer.setCustomerIdCardNumber(customer.getCustomerIdCardNumber());
			existingCustomer.setCustomerVehicle(customer.getCustomerVehicle());
			existingCustomer.setCustomerEmail(customer.getCustomerEmail());
			customerRepository.save(existingCustomer);
		}
		return customer;
	}

}
