package com.ex.level3_5;

public class PositivArrayNumber {
	
	//Given an array of numbers, check that all elements of this array are positive numbers.
	
public static void main(String args[]) {
		
		int[] arr = {1, 2, -3, 4, 5, 6};

		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] < 0) {
				System.out.println("Not All Elements are positive");
				return;
			}
			
			
		}
			
		
		    System.out.println("All numbers is positive");
		
	}

}
