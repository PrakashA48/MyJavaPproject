package com.tech;

import java.util.HashMap;
import java.util.Map;

public class Occurancechar {

	public static void main(String[] args) {
	
		String s = "abbbcccc";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] c = s.toCharArray();
		
		for(char ch : c) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		int maxcount = 0;
		
		char maxchar = ' ';
		
//		for(Map.Entry me : map.entrySet()) {
//			
//			if(maxcount < me.getValue()) {
//				maxcount = me.getValue();
//			}
//		}
		
		
		
	}

}
