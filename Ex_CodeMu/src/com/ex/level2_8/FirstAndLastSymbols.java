package com.ex.level2_8;

public class FirstAndLastSymbols {
  /**
   * 	Given a string:

		String str = "12345";
		Get the first and last character of this string as follows:
		
		String "15";
   */
	
	public static void main(String args[]) {
		String str = "12345";
		
		int strLength = str.length();
		
		System.out.println(new StringBuilder().append(str.charAt(0)).append(str.charAt(strLength - 1)).toString());	
	
	
	}
	
	
	
	
}
