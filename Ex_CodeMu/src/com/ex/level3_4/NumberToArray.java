package com.ex.level3_4;

public class NumberToArray {
	
	//Get an array of digits of this number
	
	public static void main(String args[]) {
		
		int num = 12345;
		
		String numString = num + "";
		
		int numLength = numString.length(); 
					
		byte[] arr = new byte[numLength];

		for (int i = 0; i < numLength; i++) {
			
			arr[i] = (byte) (numString.charAt(i) - '0');
		}
			
		
		for (int i = 0; i < numLength; i++) {
			
			System.out.println(arr[i]);
		}
		
		
	}

}
