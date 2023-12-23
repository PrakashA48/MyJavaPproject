package com.tech;

import java.util.HashSet;
import java.util.Set;

public class Duplicatehashsetarray {

	public static void main(String[] args) {
		int inputarray[] = new int[] { 10, 20, 30, 10, 20, 30, 45, 65, 45 };
		Set<Integer> duplicatenum = new HashSet<Integer>();
		for (Integer number : inputarray) {
			if (!duplicatenum.add(number)) {
				System.out.println("Duplicate--" + number);
			}
		}

	}

}
