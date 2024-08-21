package com.ex.level2_10;

public class CommonDivision {
	/**
	 * Given two integers:

		int num1 = 12;
		int num2 = 16;
		Print all common divisors of these numbers to the console.
	 */
	
	public static void main(String args[]) {
		
		int num1 = 12;
		int num2 = 16;
		
		
		int min = Math.min(num1, num2);
		
		for(int i=1; i<=min; i++) {
			
			if(num1%i == 0 && num2%i == 0) {
				System.out.println(i);
			}
			
		}
		
		
		
		
	}
	
	
	
	
}
