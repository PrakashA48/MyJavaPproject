package com.N.program;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

	public void duplicateWord(String word) {

		String words[] = word.split("\\s");

		Map<Object, Integer> map = new HashMap<Object, Integer>();

		for (Object name : words) {
			if (map.get(name) != null) {
				map.put(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}
		}
		
		System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey());

		Set<Object> keyset = map.keySet();

		for (Object key : keyset) {

			if (map.get(key) > 1) {
				System.out.println("duplicate words from given String -" + key);
			}

		}

	}

	public static void main(String[] args) {
		DuplicateWord dd = new DuplicateWord();
		dd.duplicateWord("big black bug bit a big black dog on his big black nose");

	}

}
