package com.murali;

public class Child_1 implements Parent_1,Parent2 {

	@Override
	public void month() {

		System.out.println(" logout");
		
	}

	@Override
	public void amount() {

		System.out.println("amount paid");
		
	}

	@Override
	public void remaining() {
		System.out.println("remaing balance");		
	}

	@Override
	public void houuse() {

		System.out.println("flatno");
		
	}

	@Override
	public void number() {

		System.out.println("flat number");
	}

	@Override
	public void street() {

		System.out.println("name of the Street");
	}
	
public static void main(String[] args) {
	
	Child_1 obj = new Child_1();
	obj.month();
	obj.amount();
	obj.remaining();
	obj.houuse();
	obj.number();
	obj.street();
	
	
	
	
}	

}
