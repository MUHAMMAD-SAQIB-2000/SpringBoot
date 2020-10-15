package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceStudentFormApplication {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s);
		SpringApplication.run(WebServiceStudentFormApplication.class, args);
	}

}
