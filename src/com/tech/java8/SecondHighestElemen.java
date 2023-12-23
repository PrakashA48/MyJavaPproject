package com.tech.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighestElemen {

	public static void main(String[] args) {
		int [] number = {10, 20, 30, 40, 50, 60};
		Integer seconndhighest =Arrays.stream(number). 
		boxed().sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst().get();
		System.out.println(seconndhighest);

	}

}
