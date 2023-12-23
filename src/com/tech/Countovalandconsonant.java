package com.tech;

public class Countovalandconsonant {

	public static void main(String[] args) {
		
		int vCount=0, cCount =0;
		
		String str = "AKKK";
		str=str.toLowerCase();
		System.out.println(str);
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'
					||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				cCount++;
			}
				
		}
		System.out.println("Count of vowels " +vCount);
		System.out.println("Count of consonant "+cCount);
		
	}

}
