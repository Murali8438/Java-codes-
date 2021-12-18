package com.murali;

public class Abstract1 extends Abstract {

	
	public void abstract1(char a, String c, String b, int d, float f) {

		System.out.println(a +" "+b + c +" " + d +" "+ f);
		
	}

	@Override
	public void abstract1(String a, String b, String c) {

		System.out.println(a+b+c);
		
	}

	@Override
	public void abstract1(int a, long b, double c, String e) {

		System.out.println(a+" "+ b +" "+ c +" "+ e );
		
	}
	
	public static void main(String[] args) {
		
		
		Abstract1 obj = new Abstract1();
		
		obj.abstract1("you can call ", "me as ", "mr MK");
	    obj.abstract1(63, 80625, 60.3, "is my number");
		obj.abstract1('k', "how could you ", "you lie to us  ", 24, 22.2f);
		
		
		
		
		
	}

	@Override
	public void abstract1(char a, String c, String b, short e, float f) {
		// TODO Auto-generated method stub
		
	}
	
	

}
