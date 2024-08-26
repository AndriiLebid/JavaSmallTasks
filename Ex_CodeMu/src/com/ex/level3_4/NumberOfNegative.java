package com.ex.level3_4;

public class NumberOfNegative {

	// Count the number of negative numbers in this array.
	
	public static void main(String args[]) {
		
		int[] arr = {1, -2, -3, 4, -5, 6};
					
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] < 0) count++;
		}
			
		
		    System.out.println(count);
		
		
	}
	
	
}
