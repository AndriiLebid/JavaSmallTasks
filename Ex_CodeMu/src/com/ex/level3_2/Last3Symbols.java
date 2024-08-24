package com.ex.level3_2;

public class Last3Symbols {
	
	/**
	 * Given a string:

		"abcdef"
		Get the last three characters of this string:
		
		"def"
	 * 
	 */
	
	public static void main(String args[]) {
			
			
			String str = "abcdef";
			
			int strLength = str.length();
			
			if(strLength < 3) {
				System.out.println("String is too short");
				return;
			}
			
			StringBuilder sb = new StringBuilder();
	
			for(int i=strLength - 3; i <= strLength - 1; i++) {

				sb.append(str.charAt(i));	
				
			}
			
			System.out.println(sb.toString());
		}

}
