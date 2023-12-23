package com.tech;

public class Descendingorder {

	public static void main(String[] args) {
		Integer arr[] = {2,2,0,1,1,0,1};
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		System.out.println();
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
 
	}

}
