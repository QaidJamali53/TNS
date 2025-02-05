package com.tns.dayone;

public class jump {

	public static void main(String[] args) {
		for(int i=5; i<10; i++) {
			if(i==6) 
				break;
			System.out.println(i);
			System.out.println("Hello");
		}
		
		
		for(int k=5; k<15; k++) {
			if(k%2==1)
				continue;
			System.out.println(k);
		}
		
		char ch='a';
		
		switch (ch) {
		case 'a':
			System.out.println("Mobile");
			break;
		case 'A':
			System.out.println("Desktop");
			break;
		default:
			System.out.println("none");
			break;
		}
	}
}
