package com.ex.level1_1;

import java.util.Scanner;

public class LastCharacterOrPreLast {
	public static void main(String args[]) {
		
		//Given a word. Get its last letter. If the word ends with an E, get the penultimate letter.
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter string:");
			
			String str = sc.nextLine().trim();
			
			
			int strLenght = str.length();
			
			if(strLenght == 0) {
				System.out.print("Your string is empty, enter string, please");
			}else {
				char lastChar = str.charAt(strLenght - 1);
				
				if(lastChar == 'e') {
					System.out.print("The penultimate letter is " + str.charAt(strLenght - 2));
				}else {
					System.out.print("The last character is: " + lastChar);
				}
			}
			
			
			
			sc.close();
	}
}
