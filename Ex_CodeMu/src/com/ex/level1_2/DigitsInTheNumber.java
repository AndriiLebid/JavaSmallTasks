package com.ex.level1_2;

import java.util.Scanner;

public class DigitsInTheNumber {
	//Given an integer, output the number of digits in this number.
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		try {
			int num = sc.nextInt();
			String numString = "" + num;
			
			int digitLength = numString.length();

		
			System.out.print("The length on number is: " + digitLength);	
		}catch(Exception ex) {
			System.out.print("I think it was a wrong number, please enter integer number.");
		}
		sc.close();
}
}
