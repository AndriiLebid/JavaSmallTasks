package com.ex.level3_1;

public class NumberWith5Base {
	//Given an array of integers, output to the console only those numbers that are divisible by 5.
	
	public static void main(String args[]) {
		
		
		int[] arr = {5, 3, 6, 15, 23};

		for(int i=0; i <= arr.length - 1; i++) {
			if(arr[i]%5==0) {
				System.out.println(arr[i]);
			}

		}
		
	}
	
}
