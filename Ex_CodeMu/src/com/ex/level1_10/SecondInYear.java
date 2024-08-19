package com.ex.level1_10;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class SecondInYear {
	public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number of year: ");
			
			try {
				int num = sc.nextInt();
				int multiplier = 60*60*24*365;
				
				BigDecimal bigDecimalNum = new BigDecimal(num);
				BigDecimal multiplierBig = new BigDecimal(multiplier);
				
				var seconds = bigDecimalNum.multiply(multiplierBig).setScale(0, RoundingMode.HALF_UP);
			
				System.out.print(seconds + " seconds in " + num + " years");	
			}catch(Exception ex) {
				System.out.print("I think it was a wrong number days, please enter integer number.");
			}
			
			sc.close();
			
		}
}
