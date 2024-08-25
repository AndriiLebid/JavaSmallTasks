package com.ex.level3_3;

public class TwoLastElement {
	/**
	 * Given an array: int[] {1, 2, 3, 4, 5, 6} 
	 * Get the last two elements from it: int[] {5, 6}
	 */
	
	public static void main(String args[]) {
		
		
		int[] numArray = {1, 2, 3, 4, 5, 6};

		int numArrayLength = numArray.length;
		
		int[] returnArray = {numArray[numArrayLength-2], numArray[numArrayLength-1]}; 
		
		for (int i = 0; i < 2; i++) {
		    System.out.println(returnArray[i]);
		}
	}
	
	
}
