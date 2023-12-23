package com.tech;

public class Countcharacter {

	public static void main(String[] args) {
		
		String s = "Hello Sir My name is Prakash";
		int len = s.length();
		System.out.println(len);
		
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != ' ') {
				count = count +1 ;
			}
		}
		
		System.out.println(count);

	}

}
