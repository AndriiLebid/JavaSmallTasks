package com.ex.level2_10;

public class FirstLastElementMove {

	/**
	 * Given an array of integers:
	
	int[] {1, 2, 3, 4, 5};
	Swap the first and last elements of this array:
	
	int[] {5, 2, 3, 4, 1};
	 
	 */
	public static void main(String args[]) {
		
		
		int[] arr = {1, 2, 3, 4, 5};
	
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		

		

		for(int i=0; i <= arr.length - 1; i++) {
			
			System.out.println(arr[i]);
	
	}
	}


}
