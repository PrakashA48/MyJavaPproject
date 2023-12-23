package com.N.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueWord {
	
	
	public void duplicateWord(String word) {
		
		String words[] = word.split("\\s");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String name : words) {
			if(map.get(name)!=null) {
				map.put(name, map.get(name)+1);
			}else {
				map.put(name, 1);
			}
		}
		
		Set<String> keyset = map.keySet();
		
		for(String key : keyset) {
			System.out.println("Word "+key+" is occured from string --"+map.get(key) + " times");
		}
		
	}

	public static void main(String[] args) {
		UniqueWord dd = new UniqueWord();
		dd.duplicateWord("big black bug bit a big black dog on his big black nose");
		
	}

}
