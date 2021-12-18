package com.murali;

public class Child2 extends Parent4{
	
	@Override
	public void camera() {
		//super.camera();
		int power = 1000;
		String name = " nikon";
		int price = 68000;
		
		String cam = power +" "+name+" "+price;
		System.out.println(Math.max(power, price)+"  "+cam);
		
	}

	
	
	public static void main(String[] args) {
	
		Parent4 obj = new Child2();
		obj.camera();
		obj.camera("krishna", "the great ", 21);
}
}