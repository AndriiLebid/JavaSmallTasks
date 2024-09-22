package com.ex.level3_10;

public class FloatConvertToInt {
	//Write the integer part of the number in one variable and the fractional part in another:
	
	public static void main(String args[]) {
		
		
		float num = 12.34f;
		
		int num1 = (int) num;
		float num2f = (num - num1)*100;
		int num2 = (int) num2f;
				
		System.out.println(num1);
		System.out.println(num2);

}
}
