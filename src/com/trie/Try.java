package com.trie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Try {
	TryNode root = null;

	public Try() {
		root = new TryNode((char) 0);
	}

	public void insert(String word) {

		int length = word.length();
		TryNode crawl = root;

		for (int level = 0; level < length; level++) {
			HashMap<Character, TryNode> child = crawl.getChildren();
			char ch = word.charAt(level);

			if (child.containsKey(ch))
				crawl = child.get(ch);
			else {
				TryNode temp = new TryNode(ch);
				child.put(ch, temp);
				crawl = temp;
			}
		}

		// Set bIsEnd true for last character,,in order to indicate it as a
		// complete meaningful word
		crawl.setIsEnd(true);
	}

	// The main method that finds out the longest string 'input'
	public String getMatchingPrefix(String input) {
		String result = ""; // Initialize resultant string
		int length = input.length(); // Find length of the input string

		// Initialize reference to traverse through Trie
		TryNode crawl = root;

		// Iterate through all characters of input string 'str' and traverse
		// down the Trie
		int level, prevMatch = 0;
		for (level = 0; level < length; level++) {
			// Find current character of str
			char ch = input.charAt(level);

			// HashMap of current Trie node to traverse down
			HashMap<Character, TryNode> child = crawl.getChildren();

			// See if there is a Trie edge for the current character
			if (child.containsKey(ch)) {
				result += ch; // Update result
				crawl = child.get(ch); // Update crawl to move down in Trie

				// If this is end of a word, then update prevMatch
				if (crawl.isEnd())
					prevMatch = level + 1;

			} else
				break;
		}

		// If the last processed character did not match end of a word,
		// return the previously matching prefix
		if (!crawl.isEnd())
			return result.substring(0, prevMatch);

		else
			return result;
	}

	public List<String> getSuggestions(String input) {
		List<String> suggestions = new ArrayList<String>();

		String result = ""; // Initialize resultant string
		int length = input.length(); // Find length of the input string

		// Initialize reference to traverse through Trie
		TryNode crawl = root;

		// Iterate through all characters of input string 'str' and traverse
		// down the Trie
		int level;
		for (level = 0; level < length; level++) {
			// Find current character of str
			char ch = input.charAt(level);

			// HashMap of current Trie node to traverse down
			HashMap<Character, TryNode> child = crawl.getChildren();

			// See if there is a Trie edge for the current character
			if (child.containsKey(ch)) {
				result += ch; // Update result
				crawl = child.get(ch); // Update crawl to move down in Trie

				// If this is end of a word, then update prevMatch
				if (crawl.isEnd())
					suggestions.add(result);

			} else
				return suggestions;
		}
		
		suggestions = moreSuggestions(crawl, suggestions, result);

		return suggestions;
	}

	private List<String> moreSuggestions(TryNode currentCrawl,List<String> suggestions, String result) {
		if (currentCrawl.isEnd()) {
			suggestions.add(result);
		}
		HashMap<Character, TryNode> moreChilds = currentCrawl.getChildren();
		for (Character ch : moreChilds.keySet()) {
			String subResult = result;
			subResult = subResult+ch;
			moreSuggestions(moreChilds.get(ch), suggestions, subResult);
		}
		return suggestions;
	}

	public static void main(String[] args) {
		Try dict = new Try();
		BufferedReader br = null;

		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("C:\\Users\\ashutosh.sharma\\Downloads\\UareU_ToDB_Java_DP_REG\\JavaSimple\\sample.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				String[]  words = sCurrentLine.split("\\s+");
				for (String word : words) {
					word = word.replaceAll(",", "");
					dict.insert(word.trim());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		

		System.out.println(dict.getSuggestions("p"));

		// String input = "cateringtobhopal";
		// System.out.print(input + ":   ");
		// System.out.println(dict.getMatchingPrefix(input));
		//
		// input = "basement";
		// System.out.print(input + ":   ");
		// System.out.println(dict.getMatchingPrefix(input));
		//
		// input = "are";
		// System.out.print(input + ":   ");
		// System.out.println(dict.getMatchingPrefix(input));
		//
		// input = "arex";
		// System.out.print(input + ":   ");
		// System.out.println(dict.getMatchingPrefix(input));
		//
		// input = "basemexz";
		// System.out.print(input + ":   ");
		// System.out.println(dict.getMatchingPrefix(input));
		//
		// input = "xyz";
		// System.out.print(input + ":   ");
		// System.out.println(dict.getMatchingPrefix(input));
	}
}
