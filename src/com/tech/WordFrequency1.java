package com.tech;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordFrequency1 {

	public static void main(String[] args) {
		String str = "This is the Java session and session is for Programming";
		
		String[] word = str.split("\\s");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		for(String words : word) {
			if(map.containsKey(words)) {
				map.put(words, map.get(words)+1);
			}else {
				map.put(words, 1);
			}
		}
		
		System.out.println("frequency of word is --"+map);
		
//		int count =0;
//		String key = "session";
//		
//		for(int i=0; i<word.length; i++) {
//			if(word[i] == key) {
//				count++;
//			}
//		}
//		System.out.println("word frequency--"+count);
	}

}
