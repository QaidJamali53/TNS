package com.tns.dayone;

public class DayThree {
	public static void main(String args[])
	{
		//widening-->  implicit type casting
		byte b=10;
		
		int i=b;
		System.out.println(i);
		
		float f=100/3f;
		double d=f;
		
		System.out.println(d);
		
		
		char ch='A';
		int l=ch;
		
		System.out.println(l);
		
		//Narrowing-->Explicit Type casting-Done forcefully
		double f1=10.52f;
		
		long l2=(long) f1;
		
		System.out.println(l2);
		
		long abc=9876543210L;
		int i12=(int) abc;
		
		System.out.println(i12);
		
		int xyz=130;
		byte b123=(byte) xyz;
		
		System.out.println(b123);
		
		
		
	
	}
}
