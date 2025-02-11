package com.tns.phasetwo;

public class Person {
	private String pName;
	private String pCity;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCity() {
		return pCity;
	}
	public void setpCity(String pCity) {
		this.pCity = pCity;
	}
	
	
	
	public Person() {
	}
	
	
	public Person(String pName, String pCity) {
		super();
		this.pName = pName;
		this.pCity = pCity;
	}
	@Override
	public String toString() {
		return "Person [pName=" + pName + ", pCity=" + pCity + "]";
	}
	
	
}
