package com.ex.level3_1;

public class ReplaceAllDefinitions {
	
	/**
	 * This line: "123-456-789" Replace all definitions with spaces: "123 456 789"
	 */
	
		public static void main(String args[]) {
				
				
				String str = "123-456-789";
				int strLegth = str.length();
				StringBuilder sb = new StringBuilder();
				
				
				for(int i=0; i <= strLegth - 1; i++) {

					if(str.charAt(i) == '-') {
						sb.append(" ");
					}else {
						sb.append(str.charAt(i));
					}

				}
				
				System.out.print(sb.toString());
				
			}

}
