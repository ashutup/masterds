package com.test.arr;

public class FindWordwithTheFirstCharOfEVeryWordInSentence {

	/**
	 * Given a string. Write a program to form a string with first character of
	 * all words. Ex: The bucket is full of water Output: Tbifow Check all edge
	 * and corner cases.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Note, this web page relates             to the Release      Candidate  milestone for Java SE 6";

		String[] words = s.split("\\s+");
		StringBuffer buf = new StringBuffer();
		for (String string : words) {
			buf.append(string.toCharArray()[0]);
		}

		System.out.println(buf.toString());
		print(s);
	}

	/***
	 * Suppose you dont have Java's String function
	 * O(n)
	 * @param s
	 */
	public static void print(String s) {
		char[] arr = s.toCharArray();
		boolean firstCharDone = false;
		StringBuffer buf = new StringBuffer();
		for (char c : arr) {
			int i = c;
			if(i != 32 && !firstCharDone){
				buf.append(c);
				firstCharDone = true;
			}
			else if(i == 32){
				firstCharDone = false;
			}
		}
		
		System.out.println(buf.toString());

	}

}
