package com.test.arr;

import java.util.HashSet;
import java.util.Set;

public class FindAllStringsPossibleOfSizeKForNCharacters {
	
	
	static int c = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd' ,'o'};
		
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		int size =5;

		String startingPoint = "";

		printAll(set, startingPoint, size);
		System.out.println(c);
	}

	private static void printAll(Set<String> arr, String startingPoint, int size) {
		if (size == 0) {
			c++;
			System.out.println(startingPoint);
			// startingPoint = "";
			return;
		}
        Set<String> set = null;
		for (String c : arr) {

			String newStartingPoint = startingPoint + c;
            
            set = new HashSet<String>(arr);
            set.remove(c);
			printAll(set, newStartingPoint, size - 1);
		}
	}

}
