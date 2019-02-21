package com.java.trade;



	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	public class TradeSort {

		public static void main(String[] args) {
			List<Trader> list=new ArrayList<Trader>();
			list.add(new Trader("vani","Hyderabad"));
			list.add(new Trader("sudha","pune"));
			list.add(new Trader("shubha","indhore"));
			list.add(new Trader("gopi","pune"));
			list.add(new Trader("rohit","indhore"));
			
			List<Trader>l1=list.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
			l1.forEach(System.out::println);
		}		
}
