package com.hibernate.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeehibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeehibernateApplication.class, args);
		BookManager manager = new BookManager();
	    manager.setup();
	 
	    manager.exit();
	}

}
