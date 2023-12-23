package com.N.program;

public class MaximumNumbersOccursList {

	public static void main(String[] args) {
		int [] arr = {1,2,3,9,5,3,7,7,7,7,3};
		int comparecount = 0; 
		int maxOccuranceNumber = 0;
		
			
		for(int i=0; i<arr.length; i++) {
			int count = 0; 
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count>comparecount) {
				comparecount = count;
				maxOccuranceNumber =arr[i];
			}
		}
		System.out.println("Max Number Occurance is :: "+maxOccuranceNumber);

	}

}
