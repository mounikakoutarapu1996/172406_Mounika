package com.java.streams;


	

	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;
	import java.util.stream.Collectors;



	public class TestCalories {

		public static void main(String[] args) {
		List<Fruit> list=new ArrayList<Fruit>();
		list.add(new Fruit("Apple",90));
		list.add(new Fruit("kiwi",100));
		list.add(new Fruit("dates",78));
		list.add(new Fruit("banana",120));
		
		
		List<Fruit> list1=list.stream().filter(a->a.getCalories()<100).sorted((x,y)->x.getCalories().compareTo(y.getCalories())).collect(Collectors.toList());
	list1.forEach(System.out::println);
		}

	}



