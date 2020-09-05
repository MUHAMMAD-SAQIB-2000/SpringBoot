package com.uog.assignment.user.security.entity;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserSecurityDetialsService implements UserDetailsService {

	@Autowired
	private UserSecurityRepsitory userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserSecurity> user = userRepository.findByUsername(username);
		user.orElseThrow(() -> new UsernameNotFoundException("Not Found" + username) );
		return user.map(MyUserSecurityDetails::new).get();
	}

}
