package com.java.trade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TradeUnquie {
	
	public static void main(String[] args) {
		List<Trader> list=new ArrayList<Trader>();
		list.add(new Trader("vani","Hyderabad"));
		list.add(new Trader("sudha","pune"));
		list.add(new Trader("shubha","indhore"));
		list.add(new Trader("gopi","pune"));
		list.add(new Trader("rohit","indhore"));
		
	Stream<String>l2=list.stream().map(Trader::getCity).distinct();
	l2.forEach(System.out::println);
	}
}
