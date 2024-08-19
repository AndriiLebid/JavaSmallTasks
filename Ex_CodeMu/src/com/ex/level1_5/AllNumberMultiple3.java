package com.ex.level1_5;

public class AllNumberMultiple3 {
	
	//Print to the console all numbers multiples of three in the range from 1 to 100.
	
	public static void main(String args[]) {
		for(int i=1; i <=100; i++) {
			if(i%3 == 0) {
				System.out.print(i+"\n\r");
			}
		}
	}
}
