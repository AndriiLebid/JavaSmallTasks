package com.ex.level3_8;

public class KebabToSnake {
	
//	Дана строка в формате:
//
//		"kebab-case"
//		Преобразуйте ее в формат:
//
//		"snake_case"
	
	
	public static void main(String args[]) {
			
			
			String str = "kebab-case-snake-case";
			
			String result = str.replace("-", "_");
	

			System.out.print(result);
	}	

}
