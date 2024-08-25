package com.ex.level3_3;

public class Palindrome {
	// Check that this word is read the same from either side.
	
		public static void main(String args[]) {
				
				
				String str = "abcba";
		
				for(int i=0; i <= str.length() - 1; i++) {
		
					if(str.charAt(i) != str.charAt((str.length() - 1)-i)) {
						System.out.println("This is not a palindrome");
						return;
					}
		
				}
				System.out.println("This is a palindrome");
			}

}
