package com.ex.level3_6;

public class RomanToInt {
	//LEETCODE Task
	
public static void main(String args[]) {
		
		String s = "IIII";
					
		
		System.out.print(romanToInt(s));

	
	}


//public static int romanToInt(String s) {
//    int ans = 0, num = 0;
//   for (int i = s.length()-1; i >= 0; i--) {
//       switch(s.charAt(i)) {
//           case 'I': num = 1; break;
//           case 'V': num = 5; break;
//           case 'X': num = 10; break;
//           case 'L': num = 50; break;
//           case 'C': num = 100; break;
//           case 'D': num = 500; break;
//           case 'M': num = 1000; break;
//       }
//       if (4 * num < ans) ans -= num;
//       else ans += num;
//   }
//   return ans;
//}
	
	
	
    public static int romanToInt(String s) {
    	
    	s = s.toUpperCase().trim();
    	int sLength = s.length();
    	int result = 0;
    	
        if(sLength > 15 || sLength < 1) {
        	System.out.print("Wrong String Length");
        	return result;
        }
        
        for(int i = 0; i < sLength; i++) {
        	
        	String sSymbol = s.charAt(i) + "";
        	
        	switch(sSymbol) {
        	  case "I":
        		  result++;
        	    break;
        	  case "V":
        		  result+=5;
        	    break;
        	  case "X":
        		  result+=10;
          	    break;
        	  case "L":
        		  result+=50;
          	    break;
        	  case "C":
        		  result+=100;
          	    break;
        	  case "D":
        		  result+=500;
          	    break;
        	  case "M":
        		  result+=1000;
          	    break;
        	  default:
              	System.out.print("Wrong String Content");
              	return 0;
        	}
        }
        
        if(s.contains("IV") || s.contains("IX")) {
        	result -=2;
        };
        
        if(s.contains("XL") || s.contains("XC")) {
        	result -= 20;
        };
        
        if(s.contains("CD") || s.contains("CM")) {
        	result -= 200;
        };

        
        return result;
        
    }
}
