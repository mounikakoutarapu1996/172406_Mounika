package com.java.lamda1;

import java.util.ArrayList;
import java.util.List;

public class FirstWord {

	public static void main(String[] args) {
		
				List<String> array = new ArrayList<String>();
				array.add("Sudha");
				array.add("vani");
				array.add("Simmy");
				array.add("shubha");
				System.out.println("Names :\n"+array);
				System.out.println("**********************************");
			
				String result = array.stream().map(sudha -> Character.toString(sudha.charAt(0))).reduce(" ", (a, b) -> a + b);
				System.out.println(result);
			
			}

	

}
