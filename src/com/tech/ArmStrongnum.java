package com.tech;

public class ArmStrongnum {
	

	public static void main(String[] args) {
		
		
		int n =156;
		int temp = n;
		int r;
		int arm = 0;
		while(n>0) {
			r = n%10;
			n = n/10;
			arm = arm + (r*r*r);
		}
		
		if(temp == arm) {
			System.out.println("It's a Armstrong number");
		}else {
			System.out.println("It's not an Armstrong Number");
		}
			
	}

}
