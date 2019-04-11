package com.arr.algos;

public class FindContigousLargestSumSubarray {

	public static void main(String[] args) {

//		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		
		int[] arr = { -2, -3, -1, -1, 3, -20, -1, 1, 50 };
		findContigousLargestSumSubarray(arr);
	}

	private static void findContigousLargestSumSubarray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int i = 0;
		int j = arr.length - 1;

		while (i <= j) {
			if (sum <= (sum - arr[i])) {
				sum = sum - arr[i];
				i++;
			} else if (sum <= (sum - arr[j])) {
				sum = sum - arr[j];
				j--;
			} else {
				break;
			}
		}

		while (i <= j) {
			System.out.println(arr[i]);
			i++;

		}

	}

}
