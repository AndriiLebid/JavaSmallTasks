package com.ex.level2_2;

public class ArithmeticMean {
	//Find the arithmetic mean of all integers from 1 to 100.
	
	public static void main(String args[]) {
		int summ = 0;
		for(int i=1; i <=100; i++) {
			summ += i;
		}
		
		int arithmeticMean = summ/100;
		
		System.out.print(arithmeticMean);
	}
}
