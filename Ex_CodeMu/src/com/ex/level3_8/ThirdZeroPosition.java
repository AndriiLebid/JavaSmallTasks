package com.ex.level3_8;

public class ThirdZeroPosition {
	//Take the position of the third zero in the line.
		public static void main(String args[]) {
				
				
				String str = "12034050607";
				int countZero = 0;
		
				for (int i = 0; i < str.length(); i++) {

					if(str.charAt(i)=='0') {
						countZero++;
						if(countZero == 3) {
							System.out.print("Third zero is in " + i + "th position");
							return;
						}
						
					}
					
					}
				System.out.print("Number does not have third zero");
		}	
	
	
}
