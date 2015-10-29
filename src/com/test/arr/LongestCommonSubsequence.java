package com.test.arr;

public class LongestCommonSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int A[] ={1,2,3,10,23,45,65,5};
		int B[] ={1,2,9,3,4,5,6,7,8};
		int[][] tab = new int[A.length+1][B.length+1];
		
		int lcs = lengthOfLCS(A, B, A.length, B.length,tab);
		System.out.println("Length of LCS : " + lcs);
		
		int[] res = new int[lcs];
		
		int i = A.length;
		int j = B.length;
		
		while(i > 0 && j > 0){
			if(A[i-1] == B[j-1]){
				res[lcs-1] = A[i-1];
				i--;
				j--;
				lcs--;
			}
			else if (tab[i-1][j] > tab[i][j-1])
				i--;
			else
				j--;
		}
		
		for (int j2 = 0; j2 < res.length; j2++) {
			System.out.println(res[j2]);
		}
	}
	
	
	
	
	public static int lengthOfLCS(int[] A, int B[], int m , int n, int[][] tab){
		
		
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if( i == 0 || j == 0)
					tab[i][j] = 0;
				else if (A[i - 1] == B[j - 1])
					tab[i][j] = 1 + tab[i-1][j-1];
				else
					tab[i][j] = Math.max(tab[i-1][j], tab[i][j-1]);
			}
			
		}
		
		return tab[m][n];
	}

}
