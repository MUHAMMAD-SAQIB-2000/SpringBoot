package com.movies.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.movies.main.repository")
public class WebServiceMoviesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceMoviesAppApplication.class, args);
		
	}

}
