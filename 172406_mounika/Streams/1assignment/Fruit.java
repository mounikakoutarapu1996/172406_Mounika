package com.java.streams;


public class Fruit {
	
	private String name;
	private int calories;
	private int price;
	private String color;
	public Fruit(String name, int calories) {
		super();
		this.name = name;
		this.calories = calories;
		
	}
	public String getName() {
		return name;
	}
	
	public Integer getCalories() {
		return calories;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + "]";
	}
	

	}
	
	
	
	


