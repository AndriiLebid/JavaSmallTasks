package com.ex.level1_8;

public class StringFromEnd {
	public static void main(String args[]) {
		// Loop through and output to the console one by one all characters from the end of the line.
		String str = "abcde";
		int strLength = str.length() - 1;		
		
		for(int i= strLength; i >= 0; i--) {
			
			System.out.println(str.charAt(i));
			
		}
		
	}
}
