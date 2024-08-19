package com.ex.level1_3;

import java.util.Scanner;

public class Remainder {

	//Given two integers, find the remainder of the first number divided by the second.
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter first number:");
			int num1 = sc.nextInt();
			
			System.out.print("Enter second number:");
			int num2 = sc.nextInt();
			
			int remainder = num1%num2;
			
			System.out.print("Remainder is: " + remainder);

		}catch(Exception ex){
			System.out.print("Error happened.");
		}
		
		sc.close();
		
	}
}
