package com.ex.level1_2;

import java.util.Scanner;

public class FirstAndLastDigitSumm {

public static void main(String args[]) {
		
		//Given an integer, output to the console the sum of the first and last digits of this number.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		try {
			int num = sc.nextInt();

			int summLastAndFirst = FirstNumber(num) + LastNumber(num);
			
			System.out.print("The sum of last and first digit is: " + summLastAndFirst);	
			
			
		}catch(Exception ex) {
			System.out.print("I think it was a wrong number, please enter integer number.");
		}
		
		sc.close();
	}

	private static int FirstNumber(int num) {
		
		int digit = 0;
		String numString = "" + num;
		char firstChar = numString.charAt(0);
		digit = firstChar - '0';
		return digit;
	}
	
	private static int LastNumber(int num) {
		int digit = 0;
		String numString = "" + num;
		int digitLength = numString.length();
		char lastChar = numString.charAt(digitLength - 1);
		digit = lastChar - '0';
		return digit;
	}
	
}
