package com.ex.level1_7;

import java.math.BigDecimal;
import java.math.RoundingMode;

//import java.text.DecimalFormat;

public class GigaToByte {
	
	//Convert this value to bytes. float gb = 35.24;
	public static void main(String args[]) {

		
		float gb = 35.24f;
		
		BigDecimal bigDecimalGBites = new BigDecimal(gb).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bigDecimalMultiplier = new BigDecimal("1024");
		
		var bigDecimalMega = bigDecimalGBites.multiply(bigDecimalMultiplier).setScale(2, RoundingMode.HALF_UP);
		var bigDecimalKilo = bigDecimalMega.multiply(bigDecimalMultiplier).setScale(2, RoundingMode.HALF_UP);
		var bigDecimalByte = bigDecimalKilo.multiply(bigDecimalMultiplier).setScale(0, RoundingMode.HALF_UP);
		
		
		System.out.println(bigDecimalMega + " MegaByte");
		System.out.println(bigDecimalKilo + " KiloByte");
		System.out.println(bigDecimalByte + " Byte");
		
		//System.out.println(new DecimalFormat("#.##").format(kb) + " KiloByte");
		
	}

}
