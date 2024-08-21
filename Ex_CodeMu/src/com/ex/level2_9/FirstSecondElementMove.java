package com.ex.level2_9;

public class FirstSecondElementMove {
	/**
	 * Given an array of integers:

		int[] {1, 2, 3, 4, 5};
		Swap the first and second elements of this array:
		
		int[] {2, 1, 3, 4, 5};
	 */
	
	public static void main(String args[]) {
		
		
		int[] arr = {1, 2, 3, 4, 5};
	
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		

		

		for(int i=0; i <= arr.length - 1; i++) {
			
			System.out.println(arr[i]);
	
	}
	}


}
