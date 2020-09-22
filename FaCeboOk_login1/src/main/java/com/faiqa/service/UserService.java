package com.faiqa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faiqa.model.User;
import com.faiqa.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User save(User newUser) {
		return repository.save(newUser);

	}

}
