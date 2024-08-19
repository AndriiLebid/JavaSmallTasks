package com.ex.level1_9;

public class CharToInt {
	
	public static void main(String args[]) {
		char chr1 = '1';
		char chr2 = '2';
		char chr3 = '3';
		
		String str =  "" + chr1 + chr2 + chr3;
		Integer number = Integer.parseInt(str);
		int num = number;
		System.out.println(num);	
	}
}
