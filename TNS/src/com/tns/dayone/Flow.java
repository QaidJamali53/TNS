package com.tns.dayone;

public class Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=55;
		
		System.out.println("The largest no is:");
		if(a>b){
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(c>b) {
				System.out.println(c);
			}
			else {
				System.out.println(b);
			}
		}
		//Increment and Decrement Operators
		int x=10,y=20;
		
		System.out.println("x and y values before the + operator:"+ x+ "  " + y);
		//Post Increment
		x++;
		
		//Pre-Increment   Post-Decrement
		int z=++x + y + x--;
		System.out.println(z);
		
		int d=z++ + x + y--;
		System.out.println("\n"+d+"\n");
	
		
		
		//while loop
		
		int i=95;
		
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		//do-while loop
		int m=11;
		do {
			System.out.println("\n"+m);
			m++;
		}while(m<=1);
		
		//for each loop
		int p[] = {10,20,30,40,50};
		for(int k:p) {
			System.out.println(k);
		}
		
		
		int beg=10, end=20;
		for (int l=beg; l<=end; l++) {
			System.out.println(" ");
			for(int f=1; f<=5; f++) {
				System.out.println(l + "*" + f + "=" + l*f);
			}
		}
	}
}
