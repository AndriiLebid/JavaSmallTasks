package com.ex.level3_9;

public class AllZeroPosition {
	//You translate the positions of all zeros in this line into the console.
	
		public static void main(String args[]) {
				
				
				String str = "023m0df0dfg0";
				
				for (int i = 0; i < str.length(); i++) {
		
					if(str.charAt(i) == '0') {
						System.out.println(i);
					
					}
				}	
		}
}
