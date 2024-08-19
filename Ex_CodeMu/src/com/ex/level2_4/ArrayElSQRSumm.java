package com.ex.level2_4;

public class ArrayElSQRSumm {
	//Find the sum of the square roots of the elements of this array.
		public static void main(String args[]) {
			
			float summ = 0;
			int[] arr = {1, 2, 3, 4, 5};
			
			for(int i=0; i <= arr.length - 1; i++) {
				summ += Math.sqrt(arr[i]);
			}
			
			
			System.out.print(summ);
		}
}
