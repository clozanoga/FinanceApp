package com.clozanoga.financeapp.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clozanoga.financeapp.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

	User findByUsername(String username);
	
	Optional<User> findById(Long id);
	
}
