package com.tns.daySeven;

public class HierarchicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		System.out.println("---Person Details-----");
		System.out.println(p1);
		
		Person p=new Person("Vaishnavi","Mumbai");
		System.out.println("Person Details:"+p);
		
		p=new Students("Nikita","Pune","Sy",78.93f);
		System.out.println("Person Details:"+p);
		
		p=new Employee("Aniket","Nashik",1003,60000f,"developer");
		System.out.println("Person Details:"+p);
	}

}
