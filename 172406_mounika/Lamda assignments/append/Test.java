package com.java.lamda;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	

		public static void main(String[] args) {
			Map<String,String> map=new HashMap<String,String>();
			map.put("sudha","Guntur");
			map.put("vani","hyd");
			map.put("Shubha","indhore");
			map.put("simmy","odissa");
			
			StringBuilder sb=new StringBuilder();
			Set<Map.Entry<String, String>> s=map.entrySet();
		
			
			for(Map.Entry<String,String> x:s) {
				sb=sb.append(x.getKey()+""+x.getValue());
			}
			
			System.out.println(sb);
			
			

		}

	
	

}
