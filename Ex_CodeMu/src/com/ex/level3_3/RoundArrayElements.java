package com.ex.level3_3;

public class RoundArrayElements {
	/**
	 * Given an array of fractional numbers:

		float[] arr = {1.11, 2.23, 3.45, 4.66, 5.98};
		Round the elements of this array to the integer part and write them to a new array.
	 */
	
		public static void main(String args[]) {
				
				float[] arr = {1.11f, 2.23f, 3.45f, 4.66f, 5.98f};				
				int[] roundArray = new int[arr.length];
				

				for (int i = 0; i < arr.length; i++) {
					
					roundArray[i] = Math.round(arr[i]);
					
				}
				
				for (int i = 0; i < arr.length; i++) {
					
				    System.out.println(roundArray[i]);
				}
				
			}
	
	
	
	
	
}
