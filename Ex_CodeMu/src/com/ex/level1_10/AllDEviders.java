package com.ex.level1_10;

public class AllDEviders {
	//Print all divisors of this number to the console.
	public static void main(String args[]) {
		
		int num = 12;
	
		for(int i=1; i <= num; i++) {
			
			if(num%i == 0)	System.out.println(i);
			
		}
		
	}
}
