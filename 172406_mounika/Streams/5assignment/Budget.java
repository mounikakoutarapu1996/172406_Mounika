package com.java.news;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Budget {

	public static void main(String[] args) {
		List<NewsId> list=new ArrayList<>();
		list.add(new NewsId(100,"Shubhangi","yes","Good Work"));
		list.add(new NewsId(100,"Simmy","yes","Budget"));
		list.add(new NewsId(100,"Priya","no",""));
		list.add(new NewsId(200,"vani","yes","Excellent"));
		list.add(new NewsId(100,"Shubhangi","no",""));
		list.add(new NewsId(200,"Simmy","yes","Budget"));
		list.add(new NewsId(100,"Priya","yes","Budget"));
		list.add(new NewsId(200,"Shubhangi","yes","Budget"));
		List<NewsId> countCommit=list.stream().filter(p->p.getComment()
				.contains("Budget")).collect(Collectors.toList());;
				long i=countCommit.stream().count();
		System.out.println(i);

	}

}
