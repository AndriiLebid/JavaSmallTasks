package com.ex.level1_1;

import java.util.Scanner;

public class WordCharactersCheck {

public static void main(String args[]) {
		
	//You are given two words. Check that the first letters of these words match.
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string:");
		
		String str1 = sc.nextLine().trim();
		
		System.out.print("Enter second string:");
		
		String str2 = sc.nextLine().trim();
		
		if(str1.length() == 0 || str2.length() == 0) {
			System.out.print("Error heppend, you enter wrong words");
		}else {
			
			char char1 = str1.charAt(0);
			char char2 = str2.charAt(0);
			
			if(char1 == char2) {
				System.out.print("The first chars is equal");
			}else {
				System.out.print("The first chars is not equal");
			}
			
			
		}
		
		
		
		
	
		sc.close();
		
	}

	
	
	
}
