package com.java.streams.color;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RedColorTest {

	public static void main(String[] args) {
		
		List<RedFruit> list=new ArrayList<RedFruit>();
		list.add(new RedFruit("Apple",90,"red"));
		list.add(new RedFruit("kiwi",100,"green"));
		list.add(new RedFruit("dates",78,"brown"));
		list.add(new RedFruit("banana",120,"yellow"));
		
		
		List<RedFruit> list1=list.stream().filter(e->e.getColor()=="red").sorted((x,y)->x.getPrice().compareTo(y.getPrice())).collect(Collectors.toList());
	list1.forEach(System.out::println);
		}

	

	}


