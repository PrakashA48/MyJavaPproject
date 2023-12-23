package com.tech;

import java.util.ArrayList;
import java.util.List;

public class FrequencyDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(20);
		list.add(20);
		
		Integer num[] = new Integer[list.size()];
		list.toArray(num);
		
		//Integer num[] = {10, 20, 30, 20, 20, 30};
		
		int freq = 0;
		int key = 20;
		
		for(int i=0; i<num.length; i++) {
			if(num[i] == key) {
				freq++;
			}
		}
		System.out.println("num-20 appears--"+freq);

	}

}
