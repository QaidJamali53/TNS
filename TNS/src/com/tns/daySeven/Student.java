package com.tns.daySeven;

public class Student extends Citizen{
	
	private int rollNo;
	private String Collegename;
	//Default Constructor
	public Student() {
		super();
	}
	public Student(String name, String aadharNo, String address, long phone,int rollNo, String collegename) {
		super(name,aadharNo,address,phone);
		this.rollNo = rollNo;
		this.Collegename = collegename;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Collegename=" + Collegename + ", getName()=" + getName()
				+ ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
	
	
}
