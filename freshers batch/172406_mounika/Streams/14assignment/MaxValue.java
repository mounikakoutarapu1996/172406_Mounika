package com.java.transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.trade.Trader;

public class MaxValue {

	public static void main(String[] args) {
		Trader t1=new Trader("vani","hyd");
		Trader t2=new Trader("mouni","Andhra");
		Trader t3=new Trader("shubha","delhi");
		Trader t4=new Trader("simmy","odhissa");
		Trader t5=new Trader("gopi","delhi");
		
		
		Transaction td1=new Transaction(t1,2010,5000);
		Transaction td2=new Transaction(t2,2011,5000);
		Transaction td3=new Transaction(t3,2015,1000);
		Transaction td4=new Transaction(t4,2019,5000);
		Transaction td5=new Transaction(t5,2020,9000);
		
		ArrayList<Transaction>tr=new ArrayList<Transaction>();	
		tr.add(td1);
		tr.add(td2);
		tr.add(td3);
		tr.add(td4);
		tr.add(td5);
		
		Integer maxval=tr.stream().max((x,y) -> x.getvalue().compareTo(y.getvalue()).map(Transaction::getValue).get();

	}

}
