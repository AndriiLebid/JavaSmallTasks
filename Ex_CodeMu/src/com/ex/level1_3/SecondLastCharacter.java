package com.ex.level1_3;

import java.util.Scanner;

public class SecondLastCharacter {
	public static void main(String args[]) {
		
		// Given a string, if there is more than one character in the string, print the second to last character of the string to the console.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string:");
		
		String str = sc.nextLine().trim();
		
		int strLenght = str.length();
		
		if(strLenght == 0) {
			System.out.print("Your string is empty, enter string, please.");
		}else if (strLenght == 1) {
			System.out.print("Your string has just one character.");
		}else{
			System.out.print("The last character is: " + str.charAt(strLenght - 2));
		}
		
		sc.close();
		
	}
}
