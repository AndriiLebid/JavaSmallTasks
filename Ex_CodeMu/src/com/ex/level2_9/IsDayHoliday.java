package com.ex.level2_9;

public class IsDayHoliday {
	/**
	 * Given an integer containing the day of the week number from 1 to 7:

		byte num = 1;
		Determine whether this variable contains a weekend or a weekday.
	 */
	public static void main(String args[]) {
		
		byte num = 1;
		
		if(num == 6 || num == 7) {
			System.out.println("This is weekend");
		}else {
			System.out.println("This is weekday");
		}	
	}
}
