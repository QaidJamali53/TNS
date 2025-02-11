package com.tns.dayone;

public class ConstructorDemo {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.setCustomername("Zeel");
		c.setCustomerID(1001);
		c.setCustomerCity("Pune");
		
		System.out.println("\n"+c);
		
		Customer c1 = new Customer("Aditya", 1002,"mumbai");
		System.out.println("\n"+c1);
	}

}
