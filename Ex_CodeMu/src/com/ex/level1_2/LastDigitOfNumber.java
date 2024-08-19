package com.ex.level1_2;

import java.util.Scanner;

public class LastDigitOfNumber {
	//Given an integer, print the last digit of this number to the console.
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number: ");
			
			try {
				int num = sc.nextInt();
				String numString = "" + num;
				
				int digitLength = numString.length();
				char lastChar = numString.charAt(digitLength - 1);
			
				System.out.print("The last digit is: " + lastChar);	
			}catch(Exception ex) {
				System.out.print("I think it was a wrong number, please enter integer number.");
			}
			
			sc.close();
	}
}