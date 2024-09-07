package com.ex.level3_7;


import java.text.DecimalFormat;

public class RoundNumbers {
	
	//Round these fractions to one decimal place.
	public static void main(String args[]) {
		
		float[] arr = {1.456f, 2.125f, 3.32f, 4.1f, 5.34f};
		float[] arrResult = new float[arr.length];
		DecimalFormat df = new DecimalFormat("#.0");
		
		for (int i = 0; i < arr.length; i++) {
			
			arrResult[i] = Float.valueOf(df.format(arr[i]));
			
			
			}
		
		for (int i = 0; i < arrResult.length; i++) {
			
			System.out.println(arrResult[i]); 
			
			
			}
		
		
		

		}
	


		
	
}
