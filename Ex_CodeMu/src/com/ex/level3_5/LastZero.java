package com.ex.level3_5;

public class LastZero {
	// Find the position of the last zero in the string.
	
		public static void main(String args[]) {
				
				String str = "1203405";
							
				
		
				for (int i = str.length() - 1; i >= 0; i--) {
					
					if(str.charAt(i) == '0') {
						 System.out.println(i);
						 return;
					}
				}
					
				
				    System.out.println("No zeto at string");
				
				
			}
	
}
