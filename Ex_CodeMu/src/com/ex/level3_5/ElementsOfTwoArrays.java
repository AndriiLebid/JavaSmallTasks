package com.ex.level3_5;

import java.util.Arrays;

public class ElementsOfTwoArrays {
	
	//Print the common elements of these arrays to the console:
	
	public static void main(String args[]) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {4, 5, 6, 7, 8};
					
		
		for(int num : arr2){
			if(Arrays.binarySearch(arr1, num) >= 0) {
				 System.out.println(num);
			}
		}
		
	}

}
