package com.tns.staticblock;

public class MyClass {
	private int section;
	private static int srNo;
	
	static {
		System.out.println("-----Within Static-----");
		
		//section=200;
		
		srNo=1000;
	}

	MyClass(){
		System.out.println("Default Constructor----");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+", section=" + section + "]";
	}
	static void display() {
		//System.out.println(section);
		System.out.println("Serial NO:"+srNo);
	}
	

}
