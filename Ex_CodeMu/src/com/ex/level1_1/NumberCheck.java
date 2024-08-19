package com.ex.level1_1;

import java.util.Scanner;

public class NumberCheck {
	public static void main(String args[]) {
		
		//Given a number. Check if it is negative or not. Output this information to the console.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		
		try {
			int num = sc.nextInt();	
			if (num < 0) {
				System.out.print("The number is negative!");
			}else {
				System.out.print("The number is not negative!");
			}
			
		}catch(Exception ex){
			System.out.print("This is not a number");
		}
		
		sc.close();	

	}
}
