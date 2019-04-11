package com.test.arr;

import java.util.Arrays;

public class PythagoreanTriplets {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20 };

		findAndPrintPythagoreanTriplet(arr);
	}

	private static void findAndPrintPythagoreanTriplet(int[] arr) {

		if (arr.length < 3) {
			System.out
					.println("Triplets not possible - as array length is less than 3");
		}

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}

		for (int i = arr.length - 1; i >= 2; i--) {
			int left = 0;
			int right = i - 1;

			while (left < right) {
				if (arr[left] + arr[right] == arr[i]) {
					System.out.println("Triplets found : "
							+ Math.sqrt(arr[left]) + ", "
							+ Math.sqrt(arr[right]) + ", " + Math.sqrt(arr[i]));
				}

				if (arr[i] > (arr[left] + arr[right])) {
					left++;

				} else {
					right--;
				}
			}
		}
	}

}
