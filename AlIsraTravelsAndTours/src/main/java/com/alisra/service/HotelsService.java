package com.alisra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alisra.entity.Hotels;
import com.alisra.repository.HotelsRepository;

@Service
public class HotelsService {
	
	@Autowired
	private HotelsRepository hotelsRepository;
	
	public void add(Hotels hotel) {
		hotelsRepository.save(hotel);
	}
	
	public List<Hotels> getAll(){
		return hotelsRepository.findAll();
	}

}
