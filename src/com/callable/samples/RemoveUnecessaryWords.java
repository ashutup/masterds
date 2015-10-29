package com.callable.samples;

import java.util.HashSet;
import java.util.Set;

public class RemoveUnecessaryWords {

	public static void main(String[] args) {
		Set<String> useLessWords = new HashSet<String>();
		useLessWords.add("a");
		useLessWords.add("an");
		useLessWords.add("to");
		useLessWords.add("is");
		useLessWords.add("from");
		useLessWords.add("for");
		useLessWords.add("the");
		useLessWords.add("be");
		useLessWords.add("like");
		useLessWords.add("and");
		useLessWords.add("or");
		useLessWords.add("why");
		useLessWords.add("what");
		useLessWords.add("which");
		useLessWords.add("where");
		useLessWords.add("who");
		useLessWords.add("if");
		useLessWords.add("do");
		useLessWords.add("anything");
		useLessWords.add("it");
		useLessWords.add("but");
		useLessWords.add("by");
		
		
		
		String str = "CPG brands rarely if ever command a devotion from consumers. Buttery spreads, toilet paper, toothpaste, Is there anything a CPG marketer can do to generate a passionate fan base? Indeed there is, but it starts by withdrawing from the race to the bottom (of price) and working to create something remarkable";
		
		for (String uselessWord : useLessWords) {
			if(str.toLowerCase().contains(uselessWord.toLowerCase())){
				str =  str.replaceAll("\\s+"+uselessWord+"\\s+", " ");
			}
		}
		
		System.out.println(str);
		
		
		
	}

}
