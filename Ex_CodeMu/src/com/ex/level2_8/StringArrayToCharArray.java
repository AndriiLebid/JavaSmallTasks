package com.ex.level2_8;

import java.util.ArrayList;

public class StringArrayToCharArray {
	/**
	 * Given an array of strings:

	String[] arr = {"ab", "cd", "ef"};
	Get an array of characters for these strings:
	
	char[] {'a', 'b', 'c', 'd', 'e', ​​'f'}
	 */

	public static void main(String args[]) {
		
		String[] arr = {"ab", "cd", "ef"};
		ArrayList<Character> charArray = new ArrayList<>();
		
		for(int i=0; i <= arr.length - 1; i++) {
			int strLenght = arr[i].length();
			for(int j=0; j <= strLenght - 1; j++) {
				charArray.add(arr[i].charAt(j));
			}
			
		}
		
		System.out.print(charArray);
	}
	
}
