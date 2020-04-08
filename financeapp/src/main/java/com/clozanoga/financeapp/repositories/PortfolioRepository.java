package com.clozanoga.financeapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clozanoga.financeapp.domain.Portfolio;

@Repository
public interface PortfolioRepository extends MongoRepository<Portfolio, Long> {

}
