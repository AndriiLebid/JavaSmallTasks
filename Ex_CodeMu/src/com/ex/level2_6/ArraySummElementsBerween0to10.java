package com.ex.level2_6;

public class ArraySummElementsBerween0to10 {
	//Find the sum of those elements of this array that are greater than zero and less than ten.
	
	public static void main(String args[]) {
		
		int summ = 0;
		int[] arr = {-1, 2, -3, 4, 5, 11};
		
		for(int i=0; i <= arr.length - 1; i++) {
			
			if (arr[i] > 0 && arr[i] < 10) {
				summ += arr[i];
			}
			
		}
		
		
		System.out.print(summ);
	}

}
