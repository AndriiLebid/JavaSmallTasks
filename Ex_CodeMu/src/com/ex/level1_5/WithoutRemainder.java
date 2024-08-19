package com.ex.level1_5;

import java.util.Scanner;

public class WithoutRemainder {
	//Given two integers, check that the first number is divisible by the second without remainder.
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter first number:");
			int num1 = sc.nextInt();
			
			System.out.print("Enter second number:");
			int num2 = sc.nextInt();
			
			int remainder = num1%num2;
			
			if(remainder == 0) {
				System.out.print("No Remainder");
			}else {
				System.out.print("With Remainder");
			}
			
			

		}catch(Exception ex){
			System.out.print("Error happened.");
		}
		
		sc.close();

	}
}
