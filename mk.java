/**
 * 
 */
package com.murali;

import java.util.Scanner;

public class mk {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input" + "enter the number:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		int product = num1*num2;
		System.out.println("Output"+product);
				
		
	}

}
