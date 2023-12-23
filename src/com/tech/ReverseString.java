package com.tech;

public class ReverseString {

	public static void main(String[] args) {
		String str = "This is the java session";
		String str2 = "";
		for(int i=str.length()-1; i>0; i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println("reverse String is-->"+str2);

	}

}
