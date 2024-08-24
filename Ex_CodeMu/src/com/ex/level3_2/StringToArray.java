package com.ex.level3_2;

public class StringToArray {
	
	/**
	 * Given a string:

			String str = "abc def jhi";
			Get an array of words from this string:
			
			String[] {"abc, "def", "jhi"}
	 */
	
		public static void main(String args[]) {
				
				
				String str = "abc def jhi";
				String[] strArray = new String[3];

				int strLegth = str.length();
				int counter = 0;
				StringBuilder sb = new StringBuilder();
				
				
				for(int i=0; i <= strLegth - 1; i++) {

					if(str.charAt(i) == ' ') {
						strArray[counter] = sb.toString();
						counter++;
						sb.setLength(0);
					}else {
						sb.append(str.charAt(i));
						if(i == strLegth - 1) {
							strArray[counter] = sb.toString();
						}
					}

				}
				
				for (int i = 0; i < 3; i++) {
				    System.out.println(strArray[i]);
				}
				
			}

}
