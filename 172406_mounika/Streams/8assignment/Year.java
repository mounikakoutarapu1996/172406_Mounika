package com.java.transaction;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.java.trade.Trader;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Stream<Integer>transaction=list.stream().filter(e->e.getYear()==2011)
				.sorted(comparator.comparing(Transaction::getValue).map(Transaction::getvalue)));

	}

}
