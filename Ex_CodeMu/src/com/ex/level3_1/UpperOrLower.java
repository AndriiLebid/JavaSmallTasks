package com.ex.level3_1;

public class UpperOrLower {
	
	/**
	 * Given a symbol:
		
		char chr = 'a';
		Find out whether this symbol is uppercase or lowercase.
	 */
	
	public static void main(String args[]) {
		char chr = 'a';
		
		if(chr == Character.toUpperCase(chr)) {
			System.out.println("The character is uppercase.");	
		}else {
			System.out.println("The character is lowercase.");	
		}
		
	}
	
}
