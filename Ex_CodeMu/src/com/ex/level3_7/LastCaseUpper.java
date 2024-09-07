package com.ex.level3_7;

public class LastCaseUpper {
	
	//Given a line, capitalize each letter of each word in this line.

	public static void main(String args[]) {
		
		String str = "abcdef abcde abcd abc";
		
		String[] arrayText = str.split(" ");
		
		String result = "";
		
		for (int i = 0; i < arrayText.length; i++) {
			
			String subString1 = arrayText[i].substring(0, arrayText[i].length()-1);
			String subString2 = arrayText[i].substring(arrayText[i].length()-1, arrayText[i].length());
			
			result += subString1 + subString2.toUpperCase() + " ";
		}
		
		System.out.print(result);

		
	}
	
}
