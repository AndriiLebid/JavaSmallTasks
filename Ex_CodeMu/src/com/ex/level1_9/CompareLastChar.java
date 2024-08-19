package com.ex.level1_9;

import java.util.Scanner;

public class CompareLastChar {
	// Given two words, check that the last letter of the first word matches the first letter of the second word.
	
	public static void main(String args[]) {
			
			
				Scanner sc = new Scanner(System.in);
				
				try {
					System.out.print("Enter first string:");
					String str1 = sc.nextLine();
					
					System.out.print("Enter second string:");
					String str2 = sc.nextLine();
					
					int strLegth1 = str1.length();
					int strLegth2 = str2.length();
					
					
					if(str1.charAt(strLegth1-1) == str2.charAt(strLegth2-1)) {
						System.out.print("The last char are the same.");
					}else {
						System.out.print("The last char are NOT the same.");
					}
						
				}catch(Exception ex) {
					System.out.print("I think it was a wrong string, please enter somthing else.");
				}
				
				sc.close();
		}
	
	
	
}
