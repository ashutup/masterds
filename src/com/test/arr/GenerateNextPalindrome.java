package com.test.arr;

public class GenerateNextPalindrome {

	/**
	 * Given a number, find the next smallest palindrome
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = { 1,1,1,2,9};
		int size = num.length;
		int i, j, mid;
		if (isEvenLenth(size)) {
			mid = size / 2;
			i = mid - 1;
			j = mid;
			mid = i;
		} else {
			mid = i = j = size / 2;
		}
		// so we have two pointers now

		while (i >= 0 && j < num.length && num[i] == num[j]) {
			i--;
			j++;
		}

		// again two cases if i and j has reached the boundaries(When the input itself is Palindrome)
		if (i == -1 || num[i] < num[j]) {
			modifyArrayByAddingOneToMiddleDigit(num, mid);
		}
		
		int[] nextPalindrome = mirrorLeftToRight(num);
		printArrayHorizontal(nextPalindrome);

	}
	
	public static void modifyArrayByAddingOneToMiddleDigit(int[] num , int mid){
		num[mid] = num[mid] + 1;
		while (mid >= 0 && num[mid] > 9) {
			num[mid - 1] = num[mid - 1] + num[mid] / 10;
			num[mid] = num[mid] % 10;
			mid--;
		}
	}

	public static int[] mirrorLeftToRight(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			arr[j] = arr[i];
			i++;
			j--;
		}
		return arr;
	}

	public static boolean isEvenLenth(int size) {
		if (size % 2 == 0)
			return true;
		return false;
	}

	public static void printArrayHorizontal(int[] arr) {
		StringBuffer buf = new StringBuffer();
		for (int i : arr) {
			buf.append(i);
		}
		System.out.println(buf.toString());
	}

}
