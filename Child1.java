package com.murali;

public class Child1 extends Parent1 {
	
	
	private void control3(String a, int b, String c) {

		System.out.println(a + " "+b+ " "+c);
		
		
	}
	
	
	public static void main(String[] args) {
	     Child1 obj = new Child1();
		
		obj.control1();
		obj.comtrol2();
		
		obj.control3("is she so cute no ", 234, "i am watching you pug");
		
	}
	
	

}
