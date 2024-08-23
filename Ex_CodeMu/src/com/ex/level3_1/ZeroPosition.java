package com.ex.level3_1;

public class ZeroPosition {
	/**
	 * Given an array of integers:

		int[] arr = {1, 2, 3, 0, 4, 5};
		Print the position of the first zero to the console.
	 */

	
		public static void main(String args[]) {
				
				
				int[] arr = {1, 2, 3, 0, 4, 5};
		
				for(int i=0; i <= arr.length - 1; i++) {
					if(arr[i] == 0) {
						System.out.println(i);
					}
		
				}
				
			}
	
	
}
