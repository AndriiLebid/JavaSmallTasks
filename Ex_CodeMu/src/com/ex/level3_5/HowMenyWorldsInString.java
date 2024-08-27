package com.ex.level3_5;



public class HowMenyWorldsInString {
	
	//Count the number of words in this string.
	
	public static void main(String args[]) {
		
		String str = "abc def jhi";
					
		String[] arrString = str.split(" ");
		
		int numberOfWorlds = arrString.length;

		System.out.println(numberOfWorlds);

		
	}

}
