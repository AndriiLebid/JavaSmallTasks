package com.ex.level3_7;

public class DeleteAllOdds {
	public static void main(String args[]) {
			
			//Remove all odd digits from this number. In our case, we get the following result:
			
			int num = 123789;
			
			String str = num + "";
			String result = "";
	
			for (int i = 0; i < str.length(); i++) {
				
				if((str.charAt(i)-'0')%2 == 0) {
					result += str.charAt(i)-'0';
				}
				
				}
			System.out.print(result);
	}	
}
