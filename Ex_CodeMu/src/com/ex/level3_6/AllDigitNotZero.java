package com.ex.level3_6;

public class AllDigitNotZero {

public static void main(String args[]) {
		
		int num = 123450;		
		String str  = num + "";

		for (int i = 0; i < str.length() ; i++) {
			
			if(str.charAt(i) == '0') {
				 System.out.println("This number contain zero");
				 return;
			}
		}
		System.out.println("This number does not contain zero");
	
	}
	

	
	
	
}
