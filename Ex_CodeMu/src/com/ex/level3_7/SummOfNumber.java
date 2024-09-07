package com.ex.level3_7;

public class SummOfNumber {
	public static void main(String args[]) {
		
		//Given integers separated by commas:
		//	Find the sum of these numbers.
		
		String str = "12,34,56";
		int summ = 0;
		
		String[] arr = str.split(",");

		for (int i = 0; i < arr.length; i++) {
			
			summ += Integer.parseInt(arr[i]);
			
			}
		System.out.print(summ);
		}	
	
}
