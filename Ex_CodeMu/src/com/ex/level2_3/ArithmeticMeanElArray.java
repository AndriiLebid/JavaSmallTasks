package com.ex.level2_3;

public class ArithmeticMeanElArray {
	public static void main(String args[]) {
		// Find the arithmetic mean of this array.
		int summ = 0;
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i=0; i <= arr.length - 1; i++) {
			summ += arr[i];
		}
		
		
		System.out.print(summ/arr.length);
	}
}
