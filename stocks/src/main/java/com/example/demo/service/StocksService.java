package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Stocks;
import com.example.demo.repository.StocksRepository;

@Service
public class StocksService {

	@Autowired
	private StocksRepository stocksRepository;
	
	public Stocks addStock(double high, String date, double low, double close, double open) {
		return stocksRepository.save(new Stocks(high, date, low, close, open));
	}
	
	public List<Stocks> getAllStocks() {
		return stocksRepository.findAll();
	}

	
	public void deleteAllStocks() {
		stocksRepository.deleteAll();
	}
	
}
