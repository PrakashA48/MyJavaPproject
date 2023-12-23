package com.tech;

public class Palindrome {
	

	public static void main(String[] args) {
		
		
		int n =121;
		int temp = n;
		int r;
		int p = 0;
		while(n>0) {
			r = n%10;
			n = n/10;
			p = (p*10)+r;
		}
		
		if(temp == p) {
			System.out.println("It's a palindrome number");
		}else {
			System.out.println("It's not an palindrome Number");
		}
			
	}

}
