package com.ex.level2_4;

import java.util.Arrays;

public class DoubleElArray {
	public static void main(String args[]) {
		// Double each element of this array
		int[] arr = {1, 2, 3, 4};
		
		for(int i=0; i <= arr.length - 1; i++) {
			arr[i] *= 2;
		}
		
		
		System.out.print(Arrays.toString(arr));
	}
}
