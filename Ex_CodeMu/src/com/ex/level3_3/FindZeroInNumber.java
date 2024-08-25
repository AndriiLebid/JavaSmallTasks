package com.ex.level3_3;

public class FindZeroInNumber {
	
public static void main(String args[]) {
		
		//Find the position of the first zero in the string.
	
		int num = 1204;
		String str = num + "";
		int intZeroCount = 0;

		for(int i=0; i <= str.length() - 1; i++) {

			if(String.valueOf(str.charAt(i)).equals("0")) {
				System.out.println("The Zeroi");
				intZeroCount++;
				break;
			}
			
		}
		
		if(intZeroCount == 0) {
			System.out.println("No zero in number.");
		}
		
	}

}
