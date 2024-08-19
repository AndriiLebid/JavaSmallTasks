package com.ex.level1_7;

import java.util.Scanner;

public class Npower2 {
	//Write code that will print the first N powers of two.
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of power: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print(Math.pow(2, i) + "\n\r");
		}
		
		
		sc.close();
	}
	
}
