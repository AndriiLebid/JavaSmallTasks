package com.ex.level1_4;

public class quarterHour {
	
	// Given an integer containing a minute number from 0 to 60: byte num = 30;
	// Determine which quarter of an hour this value falls into.
	
	public static void main(String args[]) {
		byte num = 30;
		if(num > 0 && num <= 15) {
			System.out.print("1");
		}else if (num > 15 && num <= 30) {
			System.out.print("2");
		}else if (num > 30 && num <= 45) {
			System.out.print("3");
		}else if (num > 45 && num <= 60) {
			System.out.print("4");
		}else {
			System.out.print("Error");
		}
	}

}
