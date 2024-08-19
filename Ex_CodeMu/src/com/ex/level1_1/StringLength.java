package com.ex.level1_1;

import java.util.Scanner;

public class StringLength {
	
	public static void main(String args[]) {
		
		//Given a string, output the length of this string to the console.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string:");
		
		String str = sc.nextLine();
		
		System.out.print("String lenght is: " + str.length());
	
		sc.close();
		
	}
	
}
