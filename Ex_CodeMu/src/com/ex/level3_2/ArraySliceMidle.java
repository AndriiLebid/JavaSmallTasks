package com.ex.level3_2;


	/**
	 * Given an array:

		int[] [1, 2, 3, 4, 5, 6]
		Get the following slice from it:
		
		int[] [3, 4, 5]
			 */
public class ArraySliceMidle {
	
	public static void main(String args[]) {
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] slice = new int[3];
		
		
		System.arraycopy(arr, 2, slice, 0, 3);
		
		for (int i = 0; i < slice.length; i++) {
		    System.out.println(slice[i]);
		}
		
	}
	
	

}
