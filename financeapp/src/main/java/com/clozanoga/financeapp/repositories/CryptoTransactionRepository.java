package com.clozanoga.financeapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clozanoga.financeapp.domain.CryptoTransaction;

@Repository
public interface CryptoTransactionRepository extends MongoRepository<CryptoTransaction, Long> {

}
