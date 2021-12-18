package com.murali;

public class Parent4 {

	public void camera() {

		int power = 250;
		String name = "canon 700D";
		int price = 48000;
		String cam  = power + " "+name +"  "+price ;
		
		
		System.out.println(Math.min(power, price)+"  "  + cam);
		
	}
	public void camera(String a , String b, int k) {
	
		System.out.println(a+" "+b+" "+k);
		
	}
	
	public static void main(String[] args) {
		
		Parent4 obj = new Parent4();
		obj.camera();
	
		
		
		
	}
	
}
