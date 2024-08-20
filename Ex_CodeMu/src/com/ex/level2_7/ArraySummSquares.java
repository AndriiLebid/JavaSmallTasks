package com.ex.level2_7;

public class ArraySummSquares {
	//Find the sum of the squares of the elements of this array.
	
	public static void main(String args[]) {
		
		int summ = 0;
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i=0; i <= arr.length - 1; i++) {
			summ += Math.pow(arr[i], 2);
		}
		
		
		System.out.print(summ);
	}

}
