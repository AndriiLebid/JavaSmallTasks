package com.ex.level1_2;

import java.util.Scanner;

public class FirstDigitNumbersMatch {
	public static void main(String args[]) {
		
		//Given two integers, check that the first digits of these numbers match.
		
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.print("Enter first number:");
				int num1 = sc.nextInt();
				
				System.out.print("Enter second number:");
				int num2 = sc.nextInt();
				
				String numberString1 = num1 + "";
				String numberString2 = num2 + "";
				
				if(numberString1.charAt(0) == numberString2.charAt(0)) {
					System.out.print("The first digits are the same.");
				}else {
					System.out.print("The first digits are NOT the same.");
				}
					
			}catch(Exception ex) {
				System.out.print("I think it was a wrong number, please enter integer number.");
			}
			
		
		
			sc.close();
	}
}
