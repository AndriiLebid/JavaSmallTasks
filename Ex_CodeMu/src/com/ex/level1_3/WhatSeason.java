package com.ex.level1_3;

import java.util.Scanner;

public class WhatSeason {
	
	// Determine what season this month's number falls in.
	
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number from 1 to 12: ");
		
		try {
			byte num = sc.nextByte();
			
			if(num < 1 || num > 12) {
				System.out.print("The number should be fron 1 to 12");
				sc.close();
				return;
			}
			
			if(num <=2 || num == 12) {
				System.out.print("Winter");
			}else if (num >= 3 && num <6) {
				System.out.print("Spring");
			}else if (num >= 6 && num <9) {
				System.out.print("Summer");
			}else if (num >= 9 && num <12) {
				System.out.print("Fall");
			}

		}catch(Exception ex) {
			System.out.print("I think it was a wrong number, please enter integer number.");
		}
		sc.close();
		
	}
	
}
