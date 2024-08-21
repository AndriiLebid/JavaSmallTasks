package com.ex.level2_9;


public class FillArray {
	// Use a loop to fill the array with even numbers between 1 and 100.
	
	public static void main(String args[]) {
			
			
			int[] arr = new int[50];
			int position = 0;
			
			for(int i=1; i <= 100; i++) {
				if(i%2==0) {
					arr[position]=i;
					position++;
				}

			}
			

			for(int i=0; i <= arr.length - 1; i++) {
				
				System.out.println(arr[i]);
		
		}
		}

}
