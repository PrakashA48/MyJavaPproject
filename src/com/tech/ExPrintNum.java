package com.tech;

import java.util.Scanner;

public class ExPrintNum {

	public static void main(String[] args) {
		
		int num1, num2; 
		System.out.println("Enter the first Number : ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter the last Number : ");
		num2 = sc.nextInt();

		for (int i = num1; i <=num2; i++) {
			int flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
				}
				
			}
			if (flag != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
