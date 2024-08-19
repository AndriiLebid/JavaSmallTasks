package com.ex.level2_5;

public class ShowReverseElementArray {
	public static void main(String args[]) {
		// Print the elements of this array to the console in reverse order.
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i=0; i <= arr.length - 1; i++) {
			System.out.println(arr[arr.length - 1 - i]);
		}
		
		
		
	}
}
