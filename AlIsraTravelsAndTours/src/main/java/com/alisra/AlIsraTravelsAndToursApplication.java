package com.alisra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AlIsraTravelsAndToursApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlIsraTravelsAndToursApplication.class, args);
	}

}
