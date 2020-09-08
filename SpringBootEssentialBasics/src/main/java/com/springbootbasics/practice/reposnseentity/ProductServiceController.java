package com.springbootbasics.practice.reposnseentity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootbasics.practice.exceptions.ProductNotfoundException;

@RestController
public class ProductServiceController {
	private static Map<Integer, Country> CountryRepo = new HashMap<>();
	static {
		Country honey = new Country();
		honey.setId(1);
		honey.setName("Honey");
		honey.setPopulation(7835934);
		CountryRepo.put(honey.getId(), honey);

		Country almond = new Country();
		almond.setId(2);
		almond.setName("Almond");
		honey.setPopulation(783343);
		CountryRepo.put(almond.getId(), almond);
	}

	@RequestMapping(value = "/Countrys/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable("id") int id) {
		if(!CountryRepo.containsKey(id))throw new ProductNotfoundException();
		CountryRepo.remove(id);
		return new ResponseEntity<>("Country is deleted successsfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/Countrys/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateCountry(@PathVariable("id") int id, @RequestBody Country Country) { 
		if(!CountryRepo.containsKey(id))throw new ProductNotfoundException(); 
		CountryRepo.remove(id);
		Country.setId(id);
		CountryRepo.put(id, Country);
		return new ResponseEntity<>("Country is updated successsfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/Countrys", method = RequestMethod.POST)
	public ResponseEntity<Object> createCountry(@RequestBody Country Country) {
		CountryRepo.put(Country.getId(), Country);
		return new ResponseEntity<>("Country is created successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/Countrys")
	public ResponseEntity<Object> getCountry() {
		return new ResponseEntity<>(CountryRepo.values(), HttpStatus.OK);
	}
}
