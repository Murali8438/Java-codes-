package com.murali;

import java.util.Scanner;

public class Ifclass {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a ;
		//int b;
		String c;
		int d = 1000;
		int e = 500;
		
		a = input.nextInt();
	//	b = input.nextInt();
		c = input.nextLine();
		
		if (a>=d) {
			System.out.println("you can bye the dress");
			
		}
		
		else if (a>=e) {
			System.out.println("you can buy a pair of shoes");
			
		}
		else {
			System.out.println("the amount in your card is insufficent");
		}
		
		
	}
	
	
	
	

}
