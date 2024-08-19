package com.ex.level1_10;

public class EvenSumm100 {
	//Find the sum of all even integers between 1 and 100.
	public static void main(String args[]) {
		int summ = 0;
		for(int i=1; i <=100; i++) {
			
			if(i%2 != 0) summ += i;
			
		}
		System.out.print(summ);
	}
}
