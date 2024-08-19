package com.ex.level1_1;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String args[]) {
		
		
		//Given a number, check whether it is even or not.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter the integer number: ");
		try {
			int num = sc.nextInt();
			
			if(num%2 == 0) {
				System.out.print("The number is even.");
			}else {
				System.out.print("The number is odd.");
			}
		}catch(Exception ex){
			System.out.print("Error happend, please check your number");
		}
		
		
		sc.close();
	}
}
