package com.ex.level1_2;

import java.util.Scanner;

public class FirstDigetOfNumber {
	public static void main(String args[]) {
		
		//Given an integer, print the first digit of this number to the console.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		try {
			int num = sc.nextInt();
			String numString = "" + num;
			char firstChar = numString.charAt(0);
			System.out.print("The first digit is: " + firstChar);	
		}catch(Exception ex) {
			System.out.print("I think it was a wrong number, please enter integer number.");
		}
		
		sc.close();
		
		
	}

}
