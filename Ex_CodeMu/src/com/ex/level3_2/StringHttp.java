package com.ex.level3_2;

public class StringHttp {
	//Given an array of strings, you enter into the console only those strings that begin with "http://".
	public static void main(String args[]) {
		
		String[] srtArray = {"asd", "http://ya.ru", "qwefgh", "http://google.com", "xvcxzc"};
		
		
		
		
		for(int i=0; i <= srtArray.length - 1; i++) {

			if(srtArray[i].contains("http://")){
				System.out.println(srtArray[i]);
			}
		}
		
	}

}
