package com.tns.daySeven;

public class Citizen {
	private String name;
	private String AadharNo;
	private String Address;
	private long phone;
	
	public Citizen() {
		System.out.println("Default\n");
	}
	
	public Citizen(String name, String aadharNo, String address, long phone) {
		super();
		this.name = name;
		this.AadharNo = aadharNo;
		this.Address = address;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return AadharNo;
	}
	public void setAadharNo(String aadharNo) {
		AadharNo = aadharNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", AadharNo=" + AadharNo + ", Address=" + Address + ", phone=" + phone + "]";
	}
	
	
}
