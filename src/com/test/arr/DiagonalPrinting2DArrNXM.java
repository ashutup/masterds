package com.test.arr;

public class DiagonalPrinting2DArrNXM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[][] arr = { { 1, 2, 3,4,0 }, { 5, 6,7,8,0 }, {9,10,11,12,0
		// },{13,14,15,16,0},{0,0,0,0,0} };
//		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
//		int[][] arr = { { 1, 2, 3,4 }, {5, 6,7,8 }, {  9,10,11,12 } };

		int col = 0;
		int row = 0;

		int ROWS = arr.length;
		int COLS = arr[0].length;

		int currentRow = 0;
		int currentCol = 0;
		while (col < COLS && row > -1 && col > -1 && row < ROWS) {
			// first element
			if (col == 0 && row == 0) {
				System.out.println(arr[row][col]);
				col++;
				currentCol = col;
				currentRow = row;
				continue;
			}

			System.out.println(arr[row][col]);
			row++;
			col--;

			if (ROWS > COLS) {
				if (col == -1 && row <= ROWS && currentCol == COLS - 1) {
					row = currentRow + 1;
					currentRow++;
					col = COLS - 1;

					continue;
				}

				if (col == -1) {
					col = currentCol + 1;
					currentCol++;
					row = 0;

					continue;
				}
			} else if (COLS > ROWS) {
				if (row == ROWS && col <= COLS && currentRow == ROWS - 1) {
					col = currentCol + 1;
					currentCol++;
					row = 0;

					continue;
				}

				if (row == ROWS) {
					row = currentRow + 1;
					currentRow++;

					col = COLS - 1;
					
					continue;
				}
			} else {
				if (row == ROWS) {
					row = currentRow + 1;
					currentRow++;
					col = COLS - 1;

					continue;
				}

				if (col == -1) {
					row = 0;
					col = currentCol + 1;
					currentCol++;

					continue;
				}

			}

			// last element
			if (row == ROWS && col == COLS - 3) {
				System.out.println(arr[ROWS - 1][COLS - 1]);
				break;
			}
		}
	}
}
