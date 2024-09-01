package com.ex.level3_6;



public class JoinArrays {

	
public static void main(String args[]) {

		
		// Combine these arrays into one:
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		int[] arr3 = {7, 8, 9};
		
		int[] newArray = new int[arr1.length + arr2.length + arr3.length];
		
		int[][] arr = new int[][] {arr1, arr2, arr3};
		
		int privAtteyLegth = 0;
		int arrLegth = 0;
		
		for(var element : arr) { 
			arrLegth = element.length;
			System.arraycopy(element, 0, newArray, privAtteyLegth, arrLegth);
			privAtteyLegth += arrLegth;
		}
		
		for (int i = 0; i < (arr1.length + arr2.length + arr3.length); i++) {
			
			System.out.println(newArray[i]);
		}
		
		
	}
}
