package com.ex.level3_8;

public class MaxNumber {
//		Given a string:
//
//		String str = "abcde";
//		Get an array of characters for this string:
//
//		char[] {'a', 'b', 'c', 'd', 'e'}
	
			public static void main(String args[]) {
					
					
					String str = "abcde";
					char[] arr = new char[str.length()];
					
					for (int i = 0; i < arr.length; i++) {
						arr[i] = str.charAt(i);
					}
					
					
					for (int i = 0; i < arr.length; i++) {
						System.out.println(arr[i]);
					}
					
			}	
}
