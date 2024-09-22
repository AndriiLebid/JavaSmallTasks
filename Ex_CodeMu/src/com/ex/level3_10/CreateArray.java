package com.ex.level3_10;

import java.util.ArrayList;

//Write numbers consisting of different digits into a new array:
//int arr2[] = {123, 456, 789};
	
	public class CreateArray {
		public static void main(String args[]) {
			
			int arr1[] = {123, 334, 456, 556, 789};
			ArrayList<Integer> arr2 = new ArrayList<>();
			String str = "";
		
			for (int i = 0; i < arr1.length; i++) {
				
				str = arr1[i] + "";

				
				if(isUnique(str)) {
					arr2.add(arr1[i]);
				}
			}	
			
			 System.out.println("All elements: " + arr2);
	}
		
		private static boolean isUnique(String digits) {
	        for (int i = 0; i < digits.length() - 1; i++) {
	            for (int j = i + 1; j < digits.length(); j++) {
	                if (digits.charAt(i) == digits.charAt(j)) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
		
		
}
