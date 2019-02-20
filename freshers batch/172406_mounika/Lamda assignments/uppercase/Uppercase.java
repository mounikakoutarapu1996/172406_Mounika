package com.java.uppercase;

import java.util.ArrayList;
import java.util.List;

public class Uppercase {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("vani");
		a.add("sudha");
		a.add("mouni");
		a.replaceAll(s->(s.toUpperCase()));
		a.forEach(System.out::println);
	}

}
