package com.tns.StringDemo;

public class StringOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =new String(" Indian ");
		System.out.println(s1);
		String s2=s1.toUpperCase();
		System.out.println(s2);
		
		System.out.println(s1.length());
		
		int a=s2.length();
		System.out.println(a);
		
		String s3=s1.substring(1,7);
		System.out.println(s3);
	}

}
