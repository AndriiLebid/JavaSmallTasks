package com.ex.level1_8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ByteToBb {
public static void main(String args[]) {

		
		// int b = 3535645778;
	
		BigDecimal bigDecimalBites = new BigDecimal("3535645778");
		BigDecimal bigDecimalDivaderKilo = new BigDecimal("1024");
		BigDecimal bigDecimalDivaderMega = new BigDecimal("1048576");
		BigDecimal bigDecimalDivaderGiga = new BigDecimal("1073741824");
		
		var bigDecimalKilo = bigDecimalBites.divide(bigDecimalDivaderKilo).setScale(2, RoundingMode.HALF_UP);
		var bigDecimalMega = bigDecimalBites.divide(bigDecimalDivaderMega).setScale(2, RoundingMode.HALF_UP);
		var bigDecimalGiga = bigDecimalBites.divide(bigDecimalDivaderGiga).setScale(2, RoundingMode.HALF_UP);
		
		System.out.println(bigDecimalGiga + " GigaByte");
		System.out.println(bigDecimalMega + " MegaByte");
		System.out.println(bigDecimalKilo + " KiloByte");
		

	}
}
