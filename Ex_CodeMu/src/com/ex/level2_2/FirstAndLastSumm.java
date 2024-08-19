package com.ex.level2_2;

public class FirstAndLastSumm {
	//Find the sum of the first and last digits of this number.
	
	public static void main(String args[]) {
		
		int num = 12345;
		String str = num + "";
		
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		
		int summ = (firstChar - '0') + (lastChar - '0');
		System.out.print(summ);
		
	}

}
