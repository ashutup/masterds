package com.test.arr;

public class ILessJLessK {

	/**
	 * Given an array of numbers find all such triplets that satisfy the given
	 * condition.
	 * 
	 * Condition: a[i] < a[j] < a[k] where I < j < k.
	 * 
	 * At first go I thought that it was a pretty easy question but slowly the
	 * mist started to clear and I realized how tough it was. The interviewer
	 * wanted me to solve it in linear time i.e. O(N)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };

		find3Numbers(arr);
	}

	/**
	 * 
	 * THIS IS COPY-PASTED CODE. I HAVE NOT WRITTEN IT.
	 * 
	 * @param arr
	 */
	static void find3Numbers(int arr[]) {
		int n = arr.length;
		int max = n - 1; // Index of maximum element from right side
		int min = 0; // Index of minimum element from left side
		int i;

		// Create an array that will store index of a smaller
		// element on left side. If there is no smaller element
		// on left side, then smaller[i] will be -1.
		int[] smaller = new int[n];
		smaller[0] = -1; // first entry will always be -1
		for (i = 1; i < n; i++) {
			if (arr[i] <= arr[min]) {
				min = i;
				smaller[i] = -1;
			} else
				smaller[i] = min;
		}

		// Create another array that will store index of a
		// greater element on right side. If there is no greater
		// element on right side, then greater[i] will be -1.
		int[] greater = new int[n];
		greater[n - 1] = -1; // last entry will always be -1
		for (i = n - 2; i >= 0; i--) {
			if (arr[i] >= arr[max]) {
				max = i;
				greater[i] = -1;
			} else
				greater[i] = max;
		}

		// Now find a number which has both a greater number
		// on right side and smaller number on left side
		for (i = 0; i < n; i++) {
			if (smaller[i] != -1 && greater[i] != -1) {
				System.out.print("\n"+arr[smaller[i]] + " " + arr[i] + " "
						+ arr[greater[i]]);
			}
		}

		// If we reach number, then there are no such 3 numbers
		
	}

}
