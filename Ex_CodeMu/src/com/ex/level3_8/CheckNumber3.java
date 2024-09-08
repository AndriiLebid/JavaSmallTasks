package com.ex.level3_8;

public class CheckNumber3 {

	public static void main(String args[]) {
		
		//Given an array of integers, check that all numbers in this array contain the digit 3.
		
		int[] numbers = {9823, 3, 4532, 321};

		for (int i = 0; i < numbers.length; i++) {
			
			
			
			if(!(numbers[1] + "").contains("3")) {
				System.out.print(false);
				return;
			}
			
			}
		System.out.print(true);
}	
	
	
}
