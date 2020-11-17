package com.clozanoga.financeapp.manager.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clozanoga.financeapp.domain.User;
import com.clozanoga.financeapp.repositories.UserRepository;

@Service
public class CustomUserDetailsServiceImpl implements UserDetailsService {
	
	private UserRepository userRepository;
	
	@Autowired
	public CustomUserDetailsServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		
		if (user == null) new UsernameNotFoundException("User not found");
		return user;
	}
	
	@Transactional
	public User loadUserById(Long id) {
		Optional<User> opUser = userRepository.findById(id);
		
		if (opUser.isPresent()) new UsernameNotFoundException("User not found");					
		return opUser.get();
	}

}
