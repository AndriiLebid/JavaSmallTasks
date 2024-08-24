package com.ex.level3_2;

public class FirstZero {

	
	public static void main(String args[]) {
		
		//Find the position of the first zero in the string.
		String str = "1203405";

		for(int i=0; i <= str.length() - 1; i++) {

			if(String.valueOf(str.charAt(i)).equals("0")) {
				System.out.println(i);
				break;
			}

		}
		
	}

}
