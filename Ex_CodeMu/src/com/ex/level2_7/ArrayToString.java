package com.ex.level2_7;

public class ArrayToString {
	//Merge the elements of this array into a string:
	
	public static void main(String args[]) {
			
			String str = "";
			int[] arr = {1, 2, 3, 4, 5};
			
			for(int i=0; i <= arr.length - 1; i++) {
				str += arr[i];
			}
			
			
			System.out.print(str);
		}
}
