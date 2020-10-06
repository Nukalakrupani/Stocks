package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Stocks;
import com.example.demo.service.StocksService;

@RestController
public class StocksController {
	
	@Autowired
	private StocksService stocksService;
	
	@RequestMapping("/addStock")
	public Stocks add(@RequestParam double high, @RequestParam String date, @RequestParam double low, @RequestParam double close, @RequestParam double open) {
		return stocksService.addStock(high, date, low, close, open);
	}
	
	@RequestMapping("/getAll")
	public List<Stocks> getAll() {
		return stocksService.getAllStocks();
	}
	
	
	@RequestMapping("/deleteAllStocks")
	public String deleteAllStocks() {
		stocksService.deleteAllStocks();
		return "All stocks deleted";
	}
}
