package com.ex.level2_10;

public class sixDigit3x3 {
	
	/**
	 * Given a 6-digit number

		int num = 123321;
		Check that the sum of the first three digits is equal to the sum of the second three digits.
	 */
	public static void main(String args[]) {
		
		int num = 123321;
		int summ1 = 0;
		int summ2 = 0;
		
		String strNumber = num + "";
		
		int strLength = strNumber.length()/2;
		
		for(int i = 0; i < strLength; i++) {
			summ1 += Character.getNumericValue(strNumber.charAt(i));
			summ2 += Character.getNumericValue(strNumber.charAt(i + strLength));

		}
		
		if(summ1 == summ2) {
			System.out.println("The first three digits is equal");
		}else {
			System.out.println("The first three digits is not equal");
		}
		
	}
	
}
