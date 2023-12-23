package com.tech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrequencyDemoword {

	public static void main(String[] args) {
		
		String str = "My name is Prakash and he is Java Developer";
		String word [] = str.split("\\s");
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i]+ " ");
		}
		System.out.println();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String words : word) {
			if(map.containsKey(words )) {
				map.put(words, map.get(words)+1);
			}else {
				map.put(words, 1);
			}
		}
		System.out.println("frequency of each words--"+map);
		
		Set<String> key = map.keySet();
		int count = 0;
		for(String keys :key) {
//			if(map.get(keys) >1) {
//				System.out.println("Remove Duplicate --"+keys);
//			}
//			if(map.get(keys) ==1) {
//				System.out.println("Remove Duplicate --"+keys);
//			}
			
			
		}
		
	}

}
