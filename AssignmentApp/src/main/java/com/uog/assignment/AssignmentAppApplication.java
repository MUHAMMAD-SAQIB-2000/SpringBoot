package com.uog.assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sun.el.parser.ParseException;

@SpringBootApplication
@EnableJpaRepositories
public class AssignmentAppApplication {

	public static void main(String[] args) throws java.text.ParseException, ParseException {
		SpringApplication.run(AssignmentAppApplication.class, args);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
		String date1 = "20 05 1999";
		String date2 = "22 05 1999";

		Date toDate = dateFormat.parse(date2);
		Date fromDate = dateFormat.parse(date1);
		long diff = toDate.getTime() - fromDate.getTime();
		System.out.println ("Difference in Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
	}

}
