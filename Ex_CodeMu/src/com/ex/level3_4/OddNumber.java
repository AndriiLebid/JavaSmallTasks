package com.ex.level3_4;

public class OddNumber {

	// Check that all digits of this number are odd.
	
	public static void main(String args[]) {
		
		int num = 1357;
		
		String numString = num + "";
					

		for (int i = 0; i < numString.length(); i++) {
			
			if((numString.charAt(i) - '0')%2 == 0) {
				
				System.out.println("false");
				return;
			}
		}
			
		System.out.println("true");
		
	}
}
