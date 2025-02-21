package com.tns.StringDemo;

public class SampleStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'I','n','d','i','a'};
		
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String(s1);
		System.out.println(s2);
		
		String longstr="This is to show"+" How long Sentences "+"can be printed";
		
		System.out.println(longstr);
	}

}
