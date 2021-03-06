package com.webservice.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.webservice.project.security.user.repository.UserRepository;

@SuppressWarnings("unused")
@SpringBootApplication
public class WebServiceRecordManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceRecordManagementSystemApplication.class, args);
	}

}
