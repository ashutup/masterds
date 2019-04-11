package com.arr.algos;

public class FindContigousLargestSumSubarray {

	public static void main(String[] args) {

//		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		int[] arr = { -2, -3, -1, -1, 3, -20, -1, 1, 50 };
		findContigousLargestSumSubarray(arr);
	}

	private static void findContigousLargestSumSubarray(int[] arr) {
		int maxSum = 0;
		int maxEnding = 0;

		for (int i = 0; i < arr.length; i++) {
			maxEnding = maxEnding + arr[i];
			if (maxEnding < 0) {
				maxEnding = 0;
			}

			if (maxSum < maxEnding) {
				maxSum = maxEnding;
			}
		}

		System.out.println("Largest sum contigous subarray " + maxSum);

	}

}
