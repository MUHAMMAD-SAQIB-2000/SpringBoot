package com.hibernate.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication 
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		
		System.out.println("Spring Boot Application is running");
		
//		Alien a = context.getBean(Alien.class);
//		a.show();
//		HomeController homecon = context.getBean(HomeController.class);
//		homecon.home(null);
	}

}
