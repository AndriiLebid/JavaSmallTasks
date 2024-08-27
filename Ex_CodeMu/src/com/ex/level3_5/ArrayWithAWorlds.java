package com.ex.level3_5;

public class ArrayWithAWorlds {
	// Given a text with words. Write to the array all words that begin with the letter "a".
	
	public static void main(String args[]) {

		
		// Combine these arrays into one:
		
		String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		
		String newString = "";
		
		if (text.isEmpty() || !text.contains("a")) {
			System.out.println("No text");
			return;
		}
		
		String[] arrayText = text.split(" ");
		
		
		for (int i = 0; i < arrayText.length; i++) {
			
			if(arrayText[i].charAt(0) == 'a' || arrayText[i].charAt(0) == 'A') {
				newString += arrayText[i] + " ";
			}
		}
		
		String[] newArrayText = newString.split(" ");
		
		
		for (int i = 0; i < newArrayText.length; i++) {
			
			System.out.println(newArrayText[i]);
		}
		
		
		/**
		 * String[] words = text.split("\\s+");
			List<String> result = Arrays.stream(words).filter(word -> word.toLowerCase().startsWith("a")).collect(Collectors.toList());

			result.forEach(System.out::println);

		 */
		
	
	}
	
}
