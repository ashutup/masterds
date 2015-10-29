package com.test.arr;

public class Rotate2DArrayBy90Degrees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3,7 }, { 4, 5, 6,7 }, { 7, 8, 9 ,7}, {7,7,7,7}};
//		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
		System.out.println("Before Rotation : ");
		print2DArray(arr);

//		rotateWithExtraSpace(arr);
		rotateBy90Degree(arr);

	}
	
	public static void rotateWithExtraSpace(int[][] arr){
		int R = arr.length;
		int C = arr[0].length;
		
		int[][] result = new int[C][R];
		
		for(int r=0 ; r < R ; r++){
			for(int c=0 ; c < C ; c++){
				result[c][R-r-1] = arr[r][c];
			}
		}
		System.out.println("After Rotation");
		print2DArray(result);
		
	}

	public static void rotateBy90Degree(int[][] a) {
		int n =a.length;
		for (int i = 0; i < n/2; i++) {
			for(int j = i ; j < n - i -1 ; j ++){
				int temp = a[i][j];
				a[i][j] = a[n - j -1][i];
				a[n - j -1][i] = a[n - i - 1][n - j -1];
				a[n - i - 1][n - j -1] = a[j][n - i - 1];
				a[j][n - i - 1] = temp;
			}
		}
		System.out.println("After Rotation");
		print2DArray(a);
		
	}
    

	public static void print2DArray(int[][] arr) {
		StringBuffer buf = null;
		for (int[] is : arr) {
			buf = new StringBuffer();
			for (int i = 0; i < is.length; i++) {
				buf.append(is[i] + " ");
			}
			System.out.println(buf.toString());
		}
	}

}
