package com.ex.level1_1;

import java.util.Scanner;

public class LastCharacter {
	
	public static void main(String args[]) {
		
		//Given a string, print the last character of the string to the console.

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string:");
		
		String str = sc.nextLine().trim();
		
		int strLenght = str.length();
		
		if(strLenght == 0) {
			System.out.print("Your string is empty, enter string, please");
		}else {
			System.out.print("The last character is: " + str.charAt(strLenght - 1));
		}
		
		
	
		sc.close();
		
	}

}
