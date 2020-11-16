package com.alisra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alisra.entity.Visa;
import com.alisra.repository.VisaRepository;

@Service
public class VisaService {
	
	@Autowired
	private VisaRepository repo;
	
	public void addVisa(Visa visa) {
		repo.save(visa);
	}
	
	public List<Visa> getAll(){
		return repo.findAll();
	}

}
