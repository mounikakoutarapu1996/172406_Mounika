package com.order.lamda;

public class TestOrder {

	public static void main(String[] args) {
		OrderInterface order=(amount)->{
			if(amount>10000) 
				System.out.println("order status is accepted");
			
			else 
				System.out.println("order status is completed");
		return amount;};
			order.OrderCheck(1000);
		
	}

}
