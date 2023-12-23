package com.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElement {

	public static void main(String[] args) {
		List<Integer> alist = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> dlist = new ArrayList<Integer>(alist);
		Set<Integer> set = new HashSet<Integer>(dlist);

		for (Integer num : alist) {
			if (dlist.contains(num)) {
				dlist.add(num);
			} else {
				set.add(num);
			}
		}
		System.out.println(set);

	}

}
