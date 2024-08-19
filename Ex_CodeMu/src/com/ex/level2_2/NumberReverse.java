package com.ex.level2_2;

public class NumberReverse {
	public static void main(String args[]) {
		
		
		// You enter all its digits from the end into the console.
		int num = 12345;
		String str = num + "";

		for(int i=str.length()-1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		

	}
}
