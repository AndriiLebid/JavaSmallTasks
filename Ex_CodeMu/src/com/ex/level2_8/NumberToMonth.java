package com.ex.level2_8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NumberToMonth {
	/**
	 * Given an integer containing a month number from 1 to 12:

		byte num = 1;
		Print the name of the month corresponding to this number.
	 */
	public static void main(String args[]) {
		byte num = 1;
		
		LocalDate dateTemp = LocalDate.of(0, num, 1);
		
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MMMM");
		String formatedDate = dateTemp.format(formatDate);
		
		System.out.println(formatedDate);	
	
	
	}
	
	

}
