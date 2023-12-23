package com.tech;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateremovefromString {

	public static void main(String[] args) {
		String str = "This session is for java and" +
	" session is used for programming";
		String words[] = str.split("\\s");

		Set<String> duplicateword = new LinkedHashSet<String>();
		for (String word : words) {
			if (!duplicateword.add(word)) {
				System.out.println("dupicate word is--" + word);
			}
		}

	}

}
