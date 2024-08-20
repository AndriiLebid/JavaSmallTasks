package com.ex.level2_6;

public class ElementsTillZero {
	//Print the elements of this array to the console up to the first zero.
	
	public static void main(String args[]) {
	
		int[] arr = {1, 2, 3, 0, 4, 5};
	
		for(int i=0; i <= arr.length - 1; i++) {
		
			if (arr[i] == 0) {
				break;
			}
			System.out.println(arr[i]);
		
		}

	}
}
