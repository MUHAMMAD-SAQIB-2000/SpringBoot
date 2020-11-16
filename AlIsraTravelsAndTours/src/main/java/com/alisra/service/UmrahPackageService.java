package com.alisra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alisra.entity.UmrahPackage;
import com.alisra.repository.UmrahPackageRepository;

@Service
public class UmrahPackageService {
	
	@Autowired
	private UmrahPackageRepository repo;
	
	public void add(UmrahPackage umrahPackage) {
		repo.save(umrahPackage);
	}
	
	public List<UmrahPackage> getAll(){
		return repo.findAll();
	}

}
