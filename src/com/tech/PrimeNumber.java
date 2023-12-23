package com.tech;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num , temp;
		boolean isprime = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Number-");
		num = sc.nextInt();
		//System.out.println("The Number from console is-"+num);
		
		for(int i=2; i<num/2; i++) {
			temp = num%2;
			if(temp==0) {
				isprime = false;
				break;
			}
		}
		if(isprime) {
			System.out.println("The number is prime :"+num);
		}else {
			System.out.println("The number is not prime :"+num);
		}
		

	}

}
