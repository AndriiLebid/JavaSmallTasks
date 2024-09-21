package com.ex.level3_9;

import java.util.Arrays;

public class RecreateArray {
	//Get an array of characters from these strings
	
	public static void main(String args[]) {
		
		String[] arr = {"ab", "cd", "ef"};
		String str = "";
		
		for (int i = 0; i < arr.length; i++) {
			
			str += arr[i];
			
		}
		
		int strLength = str.length();
		char[] symbolsArray = new char[strLength];
		
		for (int i = 0; i < strLength; i++) {
			
			symbolsArray[i] = str.charAt(i);
			
		}
		
		    
		    System.out.print(Arrays.toString(symbolsArray));
			
	}	
}
