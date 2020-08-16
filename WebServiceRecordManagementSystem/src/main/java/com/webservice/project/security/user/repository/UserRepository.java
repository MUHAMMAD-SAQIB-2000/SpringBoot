package com.webservice.project.security.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.project.security.user.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public Optional<User> findByUserName(String userName);
}
