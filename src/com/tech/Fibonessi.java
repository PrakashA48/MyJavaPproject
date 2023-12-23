package com.tech;

public class Fibonessi {

	public static void main(String[] args) {
		
		int a =0; 
		int b =1;
		int c;
		for(int i=0; i<=5; i++) {
			c = a+b;
			a=b;
			b=c;
			System.out.print(c+ " ");

		}
		
	}

}
