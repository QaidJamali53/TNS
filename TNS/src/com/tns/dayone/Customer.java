package com.tns.dayone;

public class Customer {
	private String customername;
	private int customerID;
	private String customerCity;
	
	
	//Default Constructor
	public Customer() {
		System.out.println("Default Constructor");
	}
	
	
	//Parametrized Constructor
	public Customer(String customername, int customerID, String customerCity) {
		super();
		this.customername = customername;
		this.customerID = customerID;
		this.customerCity = customerCity;
	}

	


	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}


	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}


	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", customerID=" + customerID + ", customerCity="
				+ customerCity + "]";
	}

}
