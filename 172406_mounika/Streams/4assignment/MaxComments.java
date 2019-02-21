package com.java.news;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxComments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<NewsId> list=new ArrayList<>();
		list.add(new NewsId(100,"Shubhangi","yes","Good Work"));
		list.add(new NewsId(100,"mouni","yes","Budget"));
		list.add(new NewsId(100,"Priya","no",""));
		list.add(new NewsId(200,"vani","yes","Excellent"));
		list.add(new NewsId(100,"mouni","no",""));
		list.add(new NewsId(200,"Simmy","yes","Budget"));
		list.add(new NewsId(100,"Priya","yes","Budget"));
		list.add(new NewsId(200,"mouni","yes","Budget"));
		Map<Object, Long> map1 = list.stream().collect(Collectors.groupingBy(NewsId::getPostedByUser, Collectors.counting()));
		long maxval1=(Collections.max(map1.values()));
		for(java.util.Map.Entry<Object, Long> entry1:map1.entrySet()) 
		{
			if(entry1.getValue()==maxval1) 
			{

			System.out.println(entry1.getKey());
			
			}	
		}

	}

}
