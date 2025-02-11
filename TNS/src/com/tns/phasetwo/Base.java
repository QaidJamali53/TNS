package com.tns.phasetwo;

public class Base {
	//declare variables
	int varDefault=10;
	public int varPublic=20;
	//private int varPrivate=30;
	protected int varProtected=40;
	
	//declare methods with access modifiers
	
	void methodDefault() {
		System.out.println("Default access Base class");
		System.out.println("Default variable:"+ varDefault+"\n");
	}
	
	public void methodPublic() {
		System.out.println("Public access Base class");
		System.out.println("Public variable:"+ varPublic+"\n");
	}
	
	protected void methodProtected() {
		System.out.println("Protected access Base class");
		System.out.println("Protected variable:"+ varProtected+"\n");
	}
	
//	private void methodPrivate() {
//		System.out.println("Private access Base class");
//		System.out.println("Private variable:");
//	}
}
