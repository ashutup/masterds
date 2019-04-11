package com.arr.algos;

/*
 * Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins doesn’t matter.
 For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4. For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.
 */
public class CoinChangeProblem {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 6 };
		int m = arr.length;
		System.out.println(count(arr, m, 10));
	}

	private static int count(int[] S, int m, int N) {
		if (N == 0) {
			return 1;
		}

		if (N < 0) {
			return 0;
		}

		if (m <= 0 && N > 0) {
			return 0;
		}
		return count(S, m - 1, N) + count(S, m, N - S[m - 1]);
	}

}
