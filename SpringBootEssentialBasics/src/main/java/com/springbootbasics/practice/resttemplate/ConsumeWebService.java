package com.springbootbasics.practice.resttemplate;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springbootbasics.practice.reposnseentity.Country;

@RestController
public class ConsumeWebService {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/template/Countrys")
	public String getCountryList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		return restTemplate.exchange(
				"http://localhost:8080/Countrys", HttpMethod.GET, entity, String.class).getBody();
	}
	@RequestMapping(value = "/template/Countrys", method = RequestMethod.POST)
	public String createCountrys(@RequestBody Country Country) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Country> entity = new HttpEntity<Country>(Country,headers);

		return restTemplate.exchange(
				"http://localhost:8080/Countrys", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/template/Countrys/{id}", method = RequestMethod.PUT)
	public String updateCountry(@PathVariable("id") String id, @RequestBody Country Country) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Country> entity = new HttpEntity<Country>(Country,headers);

		return restTemplate.exchange(
				"http://localhost:8080/Countrys/"+id, HttpMethod.PUT, entity, String.class).getBody();
	}
	@RequestMapping(value = "/template/Countrys/{id}", method = RequestMethod.DELETE)
	public String deleteCountry(@PathVariable("id") String id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Country> entity = new HttpEntity<Country>(headers);

		return restTemplate.exchange(
				"http://localhost:8080/Countrys/"+id, HttpMethod.DELETE, entity, String.class).getBody();
	}
}

