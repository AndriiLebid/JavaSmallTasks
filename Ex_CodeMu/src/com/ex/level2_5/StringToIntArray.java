package com.ex.level2_5;

import java.util.Arrays;

public class StringToIntArray {
	public static void main(String args[]) {
		// Transform this array so that the values ​​of the new array become integers:

		String[] arrStr = new String[] {"123", "456", "789"};
		int[] arrInt = new int[arrStr.length] ;
		
		for(int i=0; i <= arrStr.length - 1; i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
		}
		
		
		System.out.print(Arrays.toString(arrInt));
	}
}
