package com.ex.level1_4;

public class LoopString {
	//Loop through and output to the console one by one all characters from the end of the line "abcde".
	
	public static void main(String args[]) {
		String str = "abcde";
		
		int strLenght = str.length();
		
		for(int i = strLenght-1; i >= 0; i--) {
			System.out.print(str.charAt(i) + "\n\r");
		}
			
	}

}
