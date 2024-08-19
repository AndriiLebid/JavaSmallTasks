package com.ex.level2_1;

public class SumEvent {
	public static void main(String args[]) {
		// Find the sum of all its even digits.
		int num = 12345;
		String str = num + "";
		
		int summ = 0;
	
		for(int i=0; i <= str.length() - 1; i++) {
			
			if((str.charAt(i) - '0')%2 == 0) {
				summ += str.charAt(i) - '0';
			}
			
			
		}
			
			System.out.println(summ);

	}
}
