package com.test.arr;

import java.util.HashSet;
import java.util.Set;

public class FindANumberNotOccuringInPairs {

	/**
	 * Q- Given an array where all numbers but one occurs in pairs, suggest all
	 * ways to find the unique number. What if the array was sorted? (Code)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 2, 2, 5, 5, 7, 7, 99, 99, 3, 3, 12, 12,
				43, 43, 8, 8, 18, 50, 50 };

		nonPairedIntegerSimple(arr);

		nonPairedIntegerUsingHashSet(arr);
	}

	/***
	 * Non sorted Array
	 * 
	 * @param arr
	 */
	public static void nonPairedIntegerUsingHashSet(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i : arr) {
			if (set.contains(i)) {
				set.remove(i);
			} else {
				set.add(i);
			}
		}
		System.out.println("Single numbers : " + set);
	}

	/***
	 * Guess this solutions holds good for sorted array
	 * 
	 * @param arr
	 */
	public static void nonPairedIntegerSimple(int[] arr) {
		int x = 0;
		int y = 1;

		while (y < arr.length && arr[x] == arr[y]) {
			x = x + 2;
			y = y + 2;
		}

		System.out.println("Single numbers : " + arr[x]);
	}

	

}
