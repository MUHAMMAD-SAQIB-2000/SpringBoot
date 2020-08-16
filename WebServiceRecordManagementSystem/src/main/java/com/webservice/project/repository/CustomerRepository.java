package com.webservice.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.project.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>  {

}
