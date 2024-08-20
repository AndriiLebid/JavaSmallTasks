package com.ex.level2_7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ArrayToDate {
	// From the elements of this array, collect the date in the following format:
	public static void main(String args[]) {
		String[] arr = {"2025", "12", "31"};
		
		LocalDate arrayDate = LocalDate.of(Integer.valueOf(arr[0]), Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
		
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formatedDate = arrayDate.format(formatDate);
		
		System.out.println(formatedDate);	
	
	
	}
	
}
