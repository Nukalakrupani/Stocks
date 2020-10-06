package com.example.demo.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Stocks {
	
	@Id
	String id;
	double high;
	String date;
	double low;
	double close;
	double open;
	public Stocks(double high, String date, double low, double close, double open) {
		super();
		this.high = high;
		this.date = date;
		this.low = low;
		this.close = close;
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public String getData() {
		return date;
	}
	public void setData(String date) {
		this.date = date;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	@Override
	public String toString() {
		return "Stocks [high=" + high + ", date=" + date + ", low=" + low + ", close=" + close + ", open=" + open + "]";
	}
	
}
