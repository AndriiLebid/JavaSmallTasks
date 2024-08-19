package com.ex.level2_5;

public class ArrayPositivElSumm {
	//Find the sum of the positive elements of this array.
		public static void main(String args[]) {
			
			int summ = 0;
			int[] arr = {1, 2, -3, 4, -5};
			
			for(int i=0; i <= arr.length - 1; i++) {
				
				if(arr[i] > 0)	summ += arr[i];
			}
			
			
			System.out.print(summ);
		}
}
