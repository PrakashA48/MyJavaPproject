package com.tech;

public class ReverseWord {

	public static void main(String[] args) {
		System.out.println("Hello World !");
		
		String str = "This is the Java Session";
		String word [] = str.split("\\s");
		String output = " ";
		
		for(int i=0; i<word.length; i++) {
			output = " "+ word[i] +output;
		}
		System.out.println("reverseword is--->"+output.trim());

	}

}
