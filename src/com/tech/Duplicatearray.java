package com.tech;

public class Duplicatearray {

	public static void main(String[] args) {
		Integer arr[] = {10, 34, 34, 5, 90, 24, 100, 102, 100};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate Element found:"+arr[i]);
				}
			}
		}
	}

}
