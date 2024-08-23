package com.ex.level3_1;

public class First3Symbols {
	
	/**
	 * Given a string:

		"abcdef"
		Get the first three characters of this string:
		
		"abc"
	 * 
	 */
	
	public static void main(String args[]) {
			
			
			String str = "abcdef";
			
			if(str.length() < 3) {
				System.out.println("String is too short");
				return;
			}
			
			StringBuilder sb = new StringBuilder();
	
			for(int i=0; i <= 2; i++) {

				sb.append(str.charAt(i));	
				
			}
			
			System.out.println(sb.toString());
		}

}
