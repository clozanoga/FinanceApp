package com.clozanoga.financeapp.manager.impl;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.clozanoga.financeapp.domain.Portfolio;
import com.clozanoga.financeapp.domain.User;
import com.clozanoga.financeapp.exceptions.UsernameAlreadyExistsException;
import com.clozanoga.financeapp.manager.SequenceGeneratorService;
import com.clozanoga.financeapp.manager.UserService;
import com.clozanoga.financeapp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	private SequenceGeneratorService sequenceGeneratorService;
	
	@Autowired
	public void UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder, SequenceGeneratorService sequenceGeneratorService) {
		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		this.sequenceGeneratorService = sequenceGeneratorService;
	}
	
	@Override
	public User saveUser(User newUser) {
		try {	
			// Username has to be unique (exception)
			newUser.setUsername(newUser.getUsername());			
			
			newUser.setId(sequenceGeneratorService.generateSequence("users_sequence"));
			newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
			newUser.setCreatedAt(LocalDate.now());
			
			return userRepository.save(newUser);
		} catch (Exception e) {
			throw new UsernameAlreadyExistsException("Username '" + newUser.getUsername() + "' already exists");
		}
				
	}
	
	@Override
	public Portfolio addPortfolioToUser(User user, Portfolio portfolio) {
		portfolio.setCreatedAt(LocalDate.now());
		user.getPortfolios().add(portfolio);
		userRepository.save(user);
		
		return portfolio;
	}

	@Override
	public User getUser(String username) {
		User user = userRepository.findByUsername(username);
		
		return user;
	}
	
}
