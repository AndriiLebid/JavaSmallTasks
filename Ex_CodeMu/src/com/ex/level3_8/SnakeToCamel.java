package com.ex.level3_8;

public class SnakeToCamel {
//	Given a string in the format:
//
//		"snake_case"
//		Convert it to the format:
//
//		"camelCase"
	
	public static void main(String args[]) {
		
		
		String str = "kebab_case_snake_case";
		
		String[] arr = str.split("_");

		String result = arr[0];
		
		
		for (int i = 1; i < arr.length; i++) {

			String subString1 = arr[i].substring(0, 1);
			String subString2 = arr[i].substring(1, arr[i].length());
			
			result += subString1.toUpperCase() + subString2;
			
		}
		
		System.out.print(result);
}	

	
	
}
