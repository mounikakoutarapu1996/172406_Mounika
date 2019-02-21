package com.lamda.athmetic;

public class Test  {

	public static void main(String[] args) {
		
		Interface add=( a, b)->a+b;
		Interface sub=( a, b)->a-b;
		Interface mul=( a, b)->a*b;
		Interface div=( a, b)->a/b;
	System.out.println(add.cal(10, 10));
	System.out.println(sub.cal(10, 10));
	System.out.println(mul.cal(10, 10));
	System.out.println(div.cal(10, 10));
	}





}
