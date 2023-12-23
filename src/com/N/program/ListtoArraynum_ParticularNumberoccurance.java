package com.N.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ListtoArraynum_ParticularNumberoccurance {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(20);
		list.add(20);
		list.add(60);
		list.add(60);
		list.add(60);

		Integer num[] = new Integer[list.size()];
		list.toArray(num);

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer number : num) {
			if (map.containsKey(number)) {
				map.put(number, map.get(number) + 1);
			} else {
				map.put(number, 1);
			}
		}

		Set<Integer> keys = map.keySet();
		
		System.out.println("Enter The Number : ");
		Scanner sc = new Scanner(System.in);
		Integer n =sc.nextInt();

		for (Number key : keys) {
			if (key == n) {
				System.out.println("Number" + key + " Occurance --" + map.get(key) + " times");

			}

		}

	}

}
