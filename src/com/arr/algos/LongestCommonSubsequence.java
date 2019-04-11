package com.arr.algos;


public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "AGGTAB";
		String M = "GXTXAYB";

		System.out.println("Size of Longest Common Subsequece "
				+ lcs(S.toCharArray(), S.length() - 1, M.toCharArray(),
						M.length() - 1));

		lcsWithDP(S.toCharArray(), M.toCharArray());
	}

	private static int lcs(char[] S, int indexS, char[] M, int indexM) {
		if (S.length == 0 || M.length == 0) {
			return 0;
		}

		if (indexS < 0 || indexM < 0) {
			return 0;
		}

		if (S[indexS] == M[indexM]) {
			return 1 + lcs(S, indexS - 1, M, indexM - 1);
		}

		return Math.max(lcs(S, indexS - 1, M, indexM),
				lcs(S, indexS, M, indexM - 1));
	}

	private static void lcsWithDP(char[] S, char[] M) {

		int[][] dp = new int[S.length + 1][M.length + 1];

		for (int i = 0; i <= M.length; i++) {
			dp[0][i] = 0;
		}
		for (int i = 0; i <= S.length; i++) {
			dp[i][0] = 0;
		}

		for (int i = 0; i < S.length; i++) {
			for (int j = 0; j < M.length; j++) {

				if (S[i] == M[j]) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				} else {
					dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
				}

			}
		}

		System.out.println("Size of Longest Common SubSequence "
				+ dp[S.length][M.length]);

		int i = S.length;
		int j = M.length;

		String lcs = "";

		while (i > 0 && j > 0) {

			if (dp[i][j] == dp[i - 1][j - 1] + 1) {
				lcs = String.valueOf(S[i - 1]) + lcs;
				i--;
				j--;
			} else if (dp[i][j] == dp[i - 1][j]) {
				i--;
			} else {
				j--;
			}

		}

		System.out.println("Value of Longest Commone SubSequence is " + lcs);

	}
}
