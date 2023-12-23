package com.N.program;

import java.util.HashMap;
import java.util.Map;

import java.util.Set;

public class ParticularCharacteroccurance {

	public static void main(String[] args) {
		
	String word = "AbbAccCd";
	word = word.toLowerCase();
	
	System.out.println("Lower case words : "+word);
	char [] ch = word.toCharArray();
	
	Map<Object, Integer> map = new HashMap<Object, Integer>();
	
	for(Object c : ch ) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else {
			map.put(c, 1);
		}
	}
	
	Set<Object> key = map.keySet();
	Object cc = 'a';
	for(Object keys : key) {
		if(keys == cc) {
			System.out.println("Character "+ keys +" occurance "+map.get(keys));
		}
	}
	
	
	
	

	}

}
