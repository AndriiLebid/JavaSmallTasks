package com.ex.level2_3;

import java.util.Arrays;

public class FillArray {
	public static void main(String args[]) {
		// Use a loop to fill this array with integers from 1 to 10.

		int[] arr = new int[10];
		
		for(int i=0; i <= arr.length - 1; i++) {
			arr[i] = i + 1;
		}
		
		
		System.out.print(Arrays.toString(arr));
	}
}
