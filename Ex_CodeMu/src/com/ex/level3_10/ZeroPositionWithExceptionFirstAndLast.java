package com.ex.level3_10;

import java.util.ArrayList;

public class ZeroPositionWithExceptionFirstAndLast {
	
	// Print to the console the positions of all 0 digits in this number, except for the first and last.
	public static void main(String args[]) {
		
		
		int num = 1020304506;
		String str = num + "";
		
		ArrayList<Integer> list = new ArrayList<>();

		
		for (int i = 0; i < str.length(); i++) {

			if(str.charAt(i) == '0') {
				list.add(i);
			}
		}	
		 System.out.println("All elements except first and last: " + list.subList(1, list.size() - 1));
}

}
