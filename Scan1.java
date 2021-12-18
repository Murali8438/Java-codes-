package com.murali;

import java.util.Scanner;

public class Scan1 {
	public static void main(String[] args) {
		
	
	int name ;
	int name2;
	String name3;
	String name4;
	double name6;
	
	Scanner input = new Scanner(System.in);
	
	name = input.nextInt();
	name2 = input.nextInt();
	name3 = input.next();
	name4 = input.nextLine();
	name6 = input.nextDouble();

	System.out.println("enter the value :");
	System.out.println( "the added value is "+( name +name2));
	System.out.println(name4);
	//System.out.println(name4+ " "+name4.toUpperCase() );
	System.out.println(name6);
	
	}	
	
}
