package com.tns.daySeven;

public class Students extends Person{
	private String class1;
	private float percent;
	public Students() {
		super();
		class1="FY";
		percent=70.4f;
	}
	public Students(String name,String city,String class1, float percent) {
		super(name, city);
		this.class1 = class1;
		this.percent = percent;
	}
	public String getClass1() {
		return class1;
	}
	public void setClass1(String class1) {
		this.class1 = class1;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Students [class1=" + class1 + ", percent=" + percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	
	
}
