package com.ex.level1_7;

public class OddSumm100 {
	//Find the sum of all odd integers between 1 and 100.
	public static void main(String args[]) {
		int summ = 0;
		for(int i=1; i <=100; i++) {
			
			if(i%2 != 1) summ += i;
			
		}
		System.out.print(summ);
	}
}
