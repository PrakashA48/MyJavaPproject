package com.N.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListtoArraynum_unique {

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
		System.out.println(map);

		Set<Integer> keys = map.keySet();

		for (Number key : keys) {
			if (map.get(key) == 1) {
				System.out.println("dupicate REMOVE Number--" + key);
			}

		}

	}
}
