package com.tech;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
	
	public static void occurancechar(String name) {
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		char[] c = name.toCharArray();
		for(Character ch : c) {
			if(charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch)+1);
			}else {
				charmap.put(ch, 1);
			}
		}
		System.out.println(name+ ":"+charmap);
	}

	public static void main(String[] args) {
		occurancechar("aaa");
		occurancechar("Prakash");

	}

}
