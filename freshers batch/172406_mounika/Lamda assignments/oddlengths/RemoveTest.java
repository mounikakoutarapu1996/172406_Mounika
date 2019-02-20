package com.remove;

import java.util.ArrayList;
import java.util.List;

public class RemoveTest {

	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("Animal");
		s.add("lion");
		s.add("birds");
		s.add("monkey");
		
		s.removeIf(a->(a.length()%2!=0));
		s.forEach(System.out::println);
		}

	}


