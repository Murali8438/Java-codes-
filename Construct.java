package com.murali;

public class Construct {
	
	public Construct() {
     
		System.out.println("i am D.Muralikuamr");
	}
	
	public Construct(String a , int b) {
		
		System.out.println(a+ " "+b);	
	}
	public Construct(String c , double e , int k) {

	System.out.println(c+ " "+e +" "+k);
	}	
	public Construct(String a , String b , String c) {
    System.out.println(a+b+c);
	
	}	
	public Construct(int c, String b , char d) {

	System.out.println(c+" "+b +" "+d);
	}
	
	private void foods() {

		int k = 21;
		char c = 'R';
		String a = "Dhuruva fast foods";
		System.out.println(k+" "+c +" "+a);
		
	}

	public static void main(String[] args) {
		
		Construct obj = new Construct();
		
		Construct obj1 = new Construct("my age is ",23);

		Construct obj2 = new Construct("chicken rice",90.23,45);

		Construct obj3 = new Construct("all ","taj ","arcot ");
		
		obj.foods();
		
	}
	
}