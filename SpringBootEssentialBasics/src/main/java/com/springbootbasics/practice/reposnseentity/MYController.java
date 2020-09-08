package com.springbootbasics.practice.reposnseentity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MYController {
	
	    @RequestMapping(value = "/getCountry")
	    public ResponseEntity<Country> getCountry() {
	        
	        Country c = new Country();
	        c.setName("France");
	        c.setPopulation(66984000);
	        
	        HttpHeaders headers = new HttpHeaders();
	        headers.add("Responded", "MyController");
	        
	        return ResponseEntity.accepted().headers(headers).body(c);
	    }
	    
	    @RequestMapping(value = "/getCountry2")
	    @ResponseBody
	    public Country getCountry2() {
	        
	    	Country c = new Country();
	        c.setName("Canada");
	        c.setPopulation(66984);
	        
	        return c;
	    }    
}
