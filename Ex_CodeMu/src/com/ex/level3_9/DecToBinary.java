package com.ex.level3_9;

public class DecToBinary {

	//Convert it to binary.
	public static void main(String args[]) {
		
		
		int num = 7;

	   // System.out.print(Integer.toBinaryString(num));
		
		 StringBuilder binary = new StringBuilder();
		    while (num > 0) {
		        binary.insert(0, num % 2);
		        num /= 2;
		    }
		    System.out.print(binary);
			
	}		
	
}
