package com.ex.level2_1;

public class FirstSymbolOfEllement {
	public static void main(String args[]) {
		// Print the first characters of the elements of this array to the console.
		String[] arr = {"ab", "cd", "ef"};
		int length = arr.length;
	
		for(int i=0; i <= length - 1; i++) {
			
			System.out.println(arr[i].charAt(0));
			
		}
		
	}
}
