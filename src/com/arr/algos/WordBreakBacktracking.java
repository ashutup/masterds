package com.arr.algos;

import java.util.HashSet;
import java.util.Set;

public class WordBreakBacktracking {

	// set to hold dictionary values
	private static Set<String> dictionary = new HashSet<String>();

	public static void main(String[] args) {

		// array of strings to be added in dictionary set.
		String temp_dictionary[] = { "mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and", "go", "i",
				"like", "ice", "cream", "too", "but" };

		// loop to add all strings in dictionary set
		for (String temp : temp_dictionary) {
			dictionary.add(temp);
		}

		// sample input cases
		// System.out.println(wordBreak("ilikemanandgo"));
		// System.out.println(wordBreak("iiiiiiii"));
		// System.out.println(wordBreak(""));
		// System.out.println(wordBreak("ilikelikeimangoiii"));
		// System.out.println(wordBreak("samsungandmango"));
		// System.out.println(wordBreak("samsungandmangok"));
		// System.out.println(wordBreak("ilikesamsungbutilikemangotoo"));
		// System.out.println("===========");
		String phrase = "ilikesamsungbutilikemangotoo";
		wordBreak(phrase, "");
	}

	public static void wordBreak(String phrase, String result) {
		if (phrase == null || phrase.length() == 0) {
			return;
		}
		int size = phrase.length();
		for (int i = 1; i <= size; i++) {
			String prefix = phrase.substring(0, i);

			if (dictionary.contains(prefix)) {

				if (i == size) {
					result = result + prefix;
					System.out.println(result);
					return;
				}
				wordBreak(phrase.substring(i, size), result + prefix + " ");
			}
		}
	}
	
	
}
