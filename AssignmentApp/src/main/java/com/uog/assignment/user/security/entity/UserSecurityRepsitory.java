package com.uog.assignment.user.security.entity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSecurityRepsitory extends JpaRepository<UserSecurity, Integer>{
	
	public Optional<UserSecurity> findByUsername(String username);

}
