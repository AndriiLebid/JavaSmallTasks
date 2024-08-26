package com.ex.level3_4;

public class JoinArray {
	
	public static void main(String args[]) {

		
		// Combine these arrays into one:
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		
		int arr1Leght = arr1.length;
		int arr2Leght = arr2.length;
		
		int[] newArray = new int[arr1Leght + arr2Leght];
		
		System.arraycopy(arr1, 0, newArray, 0, arr1Leght);
		System.arraycopy(arr2, 0, newArray, arr1Leght, arr2Leght);
		
		for (int i = 0; i < (arr1Leght + arr2Leght); i++) {
			
			System.out.println(newArray[i]);
		}
		
		
	}
		
	
	
}
