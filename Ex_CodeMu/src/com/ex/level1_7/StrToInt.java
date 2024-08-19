package com.ex.level1_7;

public class StrToInt {
	public static void main(String args[]) {
		// Add the values ​​of these rows as integers.
		String str1 = "123";
		String str2 = "456";
		String str3 = "789";

		
		try {
				int num1 = Integer.parseInt(str1);
				int num2 = Integer.parseInt(str2);
				int num3 = Integer.parseInt(str3);
				
				System.out.print(num1 + num2 + num3);
			}
			catch (NumberFormatException e) {
				System.out.print("Error Number Format");
			}
		
		

		
	} 
}
