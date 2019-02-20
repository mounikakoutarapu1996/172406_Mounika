package com.java.trade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TradePune {

	public static void main(String[] args) {
		List<Trader> list=new ArrayList<Trader>();
		list.add(new Trader("vani","Hyderabad"));
		list.add(new Trader("sudha","pune"));
		list.add(new Trader("shubha","indhore"));
		list.add(new Trader("gopi","pune"));
		list.add(new Trader("rohit","indhore"));
		
		
		System.out.println("Traders from pune");
		List<Trader> l=list.stream().filter(p->p.getCity()=="pune")
		.sorted((x,y)->x.getName().compareTo(y.getName()))
		.collect(Collectors.toList());
		l.forEach(System.out::println);
		
		
		
		
		
	
	}

}
