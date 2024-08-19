package com.ex.level2_1;

public class Factorial {


	public static void main(String args[]) {
		// Find the factorial of this number.
	
	byte num = 12;
	
	int factorialValue = 1;

	for(int i=1; i <= num; i++) {
		
		factorialValue *= i; 
		
		
	}
		
		System.out.println(factorialValue);
	}
}
