package com.tech;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		int num1, num2, temp = 0;
		System.out.println("Enter the first Number : ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter the first Number : ");
		num2 = sc.nextInt();

		for (int i = num1; i <= num2; i++) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					temp++;// 
				}
			}
			if (temp == 0) {
				System.out.print(i + " ");
			} else {
				temp = 0;
			}
		}

	}

}
