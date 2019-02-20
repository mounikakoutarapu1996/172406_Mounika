package com.java.streams.calories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.streams.Fruit;

public class TestColor {

	public static void main(String[] args) {
		List<FruitColor> list=new ArrayList<FruitColor>();
		list.add(new FruitColor("Apple",90,"red"));
		list.add(new FruitColor("kiwi",100,"green"));
		list.add(new FruitColor("dates",78,"brown"));
		list.add(new FruitColor("banana",120,"yellow"));
		
		
		List<FruitColor> list1=list.stream().sorted((x,y)->x.getColor().compareTo(y.getColor())).collect(Collectors.toList());
	list1.forEach(System.out::println);
		}

	


	

}
