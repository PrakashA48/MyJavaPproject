package com.tech;

public class Digit {
	
	public static void main(String[] args) {
		String str = "This is java 78session for 99 students53";
		char[] ch =str.toCharArray();
		
		for(char c : ch) {
//			if(Character.isDigit(c)) {
//				System.out.print(c+ " ");
//			}
			if(Character.isAlphabetic(c)) {
				System.out.print(c+ " ");
			}
		}
		
	}

}
