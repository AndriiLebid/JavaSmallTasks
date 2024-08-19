package com.ex.level1_9;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class SecondsInDay {
	//Write a program that will find out how many seconds are in a day.
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number fo day: ");
		
		try {
			int num = sc.nextInt();
			int multiplier = 60*60*24;
			
			BigDecimal bigDecimalNum = new BigDecimal(num);
			BigDecimal multiplierBig = new BigDecimal(multiplier);
			
			var seconds = bigDecimalNum.multiply(multiplierBig).setScale(0, RoundingMode.HALF_UP);
		
			System.out.print(seconds + " seconds in " + num + " days");	
		}catch(Exception ex) {
			System.out.print("I think it was a wrong number days, please enter integer number.");
		}
		
		sc.close();
		
	}

}
