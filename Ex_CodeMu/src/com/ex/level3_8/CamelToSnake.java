package com.ex.level3_8;

public class CamelToSnake {
	//Given a string in the format: "camelCase" Convert it to the format: "snake_case
	
public static void main(String args[]) {
		
		
		String str = "kebabCaseSnakeCase";
		

		String result = "";
		 
		
		for (int i = 0; i < str.length(); i++) {

			char symbol = str.charAt(i);
			if(symbol == Character.toUpperCase(symbol)) {
				result += "_" + Character.toLowerCase(symbol);
			}else {
				result += symbol + "";
			}
			
			
			
		}
		
		System.out.print(result);
}	

}
