package com.ex.level3_6;

public class OutputStringWithHTML {

	// Given an array of strings, leave in this array only those strings that end with ".html".
	
	
public static void main(String args[]) {
		
		String[] str = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Ice cream.html bean", "Jackfruit.html", "Kiwi", "Lemon.html", "Mango", "Nectarine", "Orange", "Papaya", "Quince", "Raspberry.html", "Strawberry", "Tangerine"};
					
		

		for (int i = 0; i < str.length ; i++) {
			
			if(str[i].contains(".html")) {
				 System.out.println(str[i]);
			}
		}
	
	}
	

		
}
