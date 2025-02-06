package com.tns.dayone;
import java.util.*;
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter person name:");
		String name = sc.nextLine();
		
		System.out.println("Enter age:");
		int age = sc.nextInt();
		
		System.out.println("Enter gender:");
		String gender = sc.next();
		
		System.out.println("Enter Income:");
		int income = sc.nextInt();
		//person object
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		//display values
		//getter and tostring
		
		System.out.println(person);
		
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person);
		
		System.out.println("After calculation : ");
		System.out.println(person);
	}

}
