package com.ex.level3_6;

public class ReturnEvery5thElement {

	//Given an array, output every fifth element to the console.
	
	public static void main(String args[]) {
			
			int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1 ,2, 2, 3, 1, 2, 4, 5, 6, 4, 4, 5, 6, 7, 8};
						
			
	
			for (int i = 4; i < numbers.length ; i+=5) {
				
		
					 System.out.println(numbers[i]);
				
			}
		
		}
		
	
	
}
