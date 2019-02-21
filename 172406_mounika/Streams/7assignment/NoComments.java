package com.java.news;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoComments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<NewsId> list=new ArrayList<>();
		list.add(new NewsId(100,"Shubhangi","yes","Good Work"));
		list.add(new NewsId(100,"mouni","yes","Budget"));
		list.add(new NewsId(100,"Priya","no",""));
		list.add(new NewsId(200,"vani","yes","Excellent"));
		list.add(new NewsId(100,"mouni","no",""));
		list.add(new NewsId(200,"Simmy","no","Budget"));
		list.add(new NewsId(100,"Priya","yes","Budget"));
		list.add(new NewsId(200,"mouni","yes","Budget"));
		Map<Object, Long> map2 = list.stream().collect(Collectors.groupingBy(NewsId::getCommentByUser, Collectors.counting()));
		System.out.println(map2);

	}

}
