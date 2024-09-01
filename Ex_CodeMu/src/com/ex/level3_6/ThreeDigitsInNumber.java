package com.ex.level3_6;

public class ThreeDigitsInNumber {

	// Given an array of integers, you enter numbers consisting of more than three digits into the console.
	
	public static void main(String args[]) {
		
		int[] numbers = {123, 4, 56, 7890};
					
		

		for (int i = 0; i < numbers.length ; i++) {
			
			if((numbers[i]+"").length() >= 3) {
				 System.out.println(numbers[i]);
			}
		}
	
	}
	
}
