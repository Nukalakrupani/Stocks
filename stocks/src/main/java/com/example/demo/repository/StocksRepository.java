package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Stocks;

@Repository
public interface StocksRepository extends MongoRepository<Stocks, String>{
}
