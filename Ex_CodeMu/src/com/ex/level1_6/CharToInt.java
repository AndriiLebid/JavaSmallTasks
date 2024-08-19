package com.ex.level1_6;

public class CharToInt {
public static void main(String args[]) {
		
		//Add the values ​​of these symbols as integers.
		
	char chr1 = '1';
	char chr2 = '2';
	char chr3 = '3';
	
	System.out.print(CharToInt(chr1)+CharToInt(chr2)+CharToInt(chr3));

	}

	private static int CharToInt(char ch) {
		
		return  ch - '0';

	}
	
}
