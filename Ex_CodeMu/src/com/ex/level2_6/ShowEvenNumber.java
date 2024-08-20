package com.ex.level2_6;

public class ShowEvenNumber {
	//Print to the console the elements of this array that are even numbers.
	
	public static void main(String args[]) {
		

		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i=0; i <= arr.length - 1; i++) {
			
			if (arr[i]%2 == 0) {
				System.out.println(arr[i]);
			}
			
		}
	
		
	}

}
