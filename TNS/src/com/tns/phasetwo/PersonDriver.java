package com.tns.phasetwo;

public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person();
		p.setpName("Riya");
		p.setpCity("Pune");
		
		System.out.println("Default\t"+p.getpCity()+"\t"+p.getpName());
		
		Person p1=new Person("Jams","Mumbai");
		System.out.println("Parametrized\t"+p1.getpCity()+"\t"+p1.getpName());

	}

}
