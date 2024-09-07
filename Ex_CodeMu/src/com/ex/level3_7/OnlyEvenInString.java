package com.ex.level3_7;

public class OnlyEvenInString {

	//Given a string, check that this string consists of only even digits.
	public static void main(String args[]) {
			
			String str = "2468afgdf";
			int ch = 0;
			
			for (int i = 0; i < str.length(); i++) {
				
				ch = str.charAt(i) - '0';
				if(ch%2 == 1) {
					System.out.print(false);
					return;
				}

			}
			System.out.print(true);

	
			
		}
	
	
}
