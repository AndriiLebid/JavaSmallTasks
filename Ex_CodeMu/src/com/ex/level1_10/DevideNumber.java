package com.ex.level1_10;

public class DevideNumber {
	public static void main(String args[]) {
			
		//Divide it by two as many times as necessary until the result is less than 10. How many iterations will this require?
		
		float num = 12345;
		int i = 0;
		while(num > 10){
			num = num/2;
			i++;
		}
		
		System.out.println(i);
		
			
	}
}
