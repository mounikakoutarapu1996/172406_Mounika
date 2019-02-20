package com.java.streams.color;

public class RedFruit {
	private String name;
	private int calories;
	private int price;
	private String color;
	public RedFruit(String name,int price, String color) {
		super();
		this.name=name;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return getName();
	}
	public Integer getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "RedFruit [name=" + name + ", price=" + price + ", color=" + color + "]";
	}
	
	
	

}
