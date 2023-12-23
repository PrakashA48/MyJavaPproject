package com.tech;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceExDemo {

	public static void occurancechar(String name) {
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		char[] c = name.toCharArray();

		for (Character ch : c) {
			System.out.println(charmap.get(ch));
			// if(charmap.get(ch) != null)
			//if(!String.valueOf(ch).isBlank()) {
			if (charmap.containsKey(ch)) {

				charmap.put(ch, charmap.get(ch) + 1);
			} else {
				charmap.put(ch, 1);
			}
			//}
		}
		System.out.println(name + ":" + charmap);

		Set<Character> keychar = charmap.keySet();
		for (Character key : keychar) {
			if (charmap.get(key) > 1) {
				System.out.println("duplicate----" + key);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurancechar("My name is Prakash");
		// occurancechar("Prakash");

	}

}
