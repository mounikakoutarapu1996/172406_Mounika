package com.java.transaction;

import com.java.trade.Trader;

public class Transaction {
	
	private Trader trader;
	private Integer year;
	private Integer value;
	
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public Integer getYear() {
		return year;
	}
	public Integer getvalue() {
		return value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	
	
	

}
