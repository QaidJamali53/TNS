package com.tns.nestedInterface;

public class NestedDemo implements OuterInterface,OuterInterface.InnerInterface{

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		System.out.println("OuterInterface");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("InnerInterface");
	}

}
