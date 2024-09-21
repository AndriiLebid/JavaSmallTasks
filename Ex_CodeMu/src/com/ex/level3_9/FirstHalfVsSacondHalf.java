package com.ex.level3_9;

public class FirstHalfVsSacondHalf {
	//Divide the sum of the first half of the elements of this array by the sum of the second half of the elements.
	
	public static void main(String args[]) {
		
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		int arrLegth = arr.length/2;
		
		double firstSum = 0;
		double secondSum = 0;
		
		
		for (int i = 0; i < arrLegth; i++) {

			firstSum+=arr[i];
			secondSum+=arr[arrLegth + i];
			
		}	
		
		double result = firstSum/secondSum;
		
		System.out.print(result);
}
	
	
	
}
