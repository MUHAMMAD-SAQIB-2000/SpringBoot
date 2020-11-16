package com.alisra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alisra.entity.ContactUsForm;
import com.alisra.repository.ContactUsFormRepository;

@Service
public class ContactUsFormService {
	
	@Autowired
	private ContactUsFormRepository contactUsFormRepository;
	
	public void addResponse(ContactUsForm contactUsForm) {
		contactUsFormRepository.save(contactUsForm);
	}

}
