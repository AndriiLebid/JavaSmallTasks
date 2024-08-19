package com.ex.level1_7;

public class NumberSumm {
	
	    //Given a number:
		//12345
		//Find the sum of the digits of this number.
	
	
	public static void main(String args[]) {
		
		int num = 12345;
		String numString = num + "";
		
		int strintLeght = numString.length();
		int summ = 0;
		
		for(int i = 0; i <= strintLeght -1 ; i++) {
			
			summ += numString.charAt(i) - '0'; 
		}
		System.out.print(summ);
		
	}

}
