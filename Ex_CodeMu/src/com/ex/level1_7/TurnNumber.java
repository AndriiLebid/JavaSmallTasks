package com.ex.level1_7;

public class TurnNumber {
	public static void main(String args[]) {
		// Given a number: 12345
		// Turn it over: 54321


		
		try {
			int num = 12345;
			String str = num + "";
			int lengthNum = str.length();
			String newString = "";
			for(int i=1; i <= lengthNum; i++) {
				newString += str.charAt(lengthNum - i);
			}
			System.out.print(newString);
			}
			catch (NumberFormatException e) {
				System.out.print("Error Number Format");
			}
		
		

		
	} 
}
