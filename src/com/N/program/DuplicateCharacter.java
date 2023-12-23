package com.N.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
	String word = "AbbAccCd";
	word = word.toLowerCase();
	System.out.println("Lower case words : "+word);
	char [] ch = word.toCharArray();
	
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	
	for(Character c : ch ) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else {
			map.put(c, 1);
		}
	}
	
	Set<Character> key = map.keySet();
	int max = 'c';
	for(Character keys : key) {
		
		if(keys == max) {
			System.out.println(keys+ " = " +map.get(keys));
		}
//		if(map.get(keys) == 1) {
//			System.out.println("Duplicate Character Presenet inside String--"+keys);
//		}
	}
	
	
	
	

	}

}
