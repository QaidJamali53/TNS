package com.tns.Polymorphism;

class RBI{
	public float getrateofinterest() {
		return 6.2f;
	}
}

class SBI extends RBI{
	
	@Override
	public float getrateofinterest() {
		return 6.5f;
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		System.out.println(s.getrateofinterest());
		
		//Co-variant overriding
		RBI rbi;
		
		rbi = new RBI();
		System.out.println(s.getrateofinterest());
		
		rbi=new SBI();
		System.out.println(s.getrateofinterest());
	}

}
