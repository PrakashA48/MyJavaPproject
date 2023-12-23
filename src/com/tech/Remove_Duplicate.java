package com.tech;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Remove_Duplicate {

	public static void main(String[] args) {
		
		//String str = "This is the java session session is very important";
		String str = "This session is for java and session is used for programming"; 
		String [] words = str.split("\\s");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String word : words) {
			//System.out.println(map.get(word));
			
			if(map.get(word)!= null) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		
		Set<String> keyset = map.keySet();
		for(String key : keyset ) {
			if(map.get(key) == 1) {
				System.out.println(key);
			}
		}

	}

}
