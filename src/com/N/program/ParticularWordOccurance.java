package com.N.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ParticularWordOccurance {

	public void duplicateWord(String word) {

		String words[] = word.split("\\s");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		System.out.println();
		for (String name : words) {
			System.out.print(map.get(name) + " ");
			if (map.get(name) != null) {
				map.put(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}
		}

		Set<String> keyset = map.keySet();
		String ww = "big";

		for (String key : keyset) {

			if (key == ww) {
				System.out.println("Word " + key + " is occured from string --" + map.get(key) + " times");

			}
		}

	}

	public static void main(String[] args) {
		ParticularWordOccurance dd = new ParticularWordOccurance();
		dd.duplicateWord("big black bug bit a big black dog on his big black nose");

	}

}
