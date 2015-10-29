package com.callable.samples;

public class SpiralIterationMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4,22,111 }, { 5, 6, 7, 8,33,222 }, { 9, 10, 11, 12,44 ,333},
				{ 13, 14, 15, 16,55,444 } };

		System.out.println("Original Matrix ->");
		for (int[] is : matrix) {
			StringBuffer buf = new StringBuffer();
			for (int i : is) {
				buf.append(i).append(",");
			}
			System.out.println(buf.toString());
		}

		System.out.println("\n");
		int startRow = 0;
		int endRow = 4;

		int startColumn = 0;
		int endcolumn = 6;
        StringBuffer sb = new StringBuffer();
		while (startRow < endRow && startColumn < endcolumn) {
			for (int i = startRow; i < endcolumn; i++) {
				sb.append(matrix[startRow][i]);
				sb.append(", ");
			}
			startRow++;

			for (int i = startRow; i < endRow; i++) {
				sb.append(matrix[i][endcolumn - 1]);
				sb.append(", ");
			}
			endcolumn--;

			if (startRow < endRow) {
				for (int i = endcolumn - 1; i >= 0; --i) {
					sb.append(matrix[endRow - 1][i]);
					sb.append(", ");
				}
				endRow--;
			}

			if (startColumn < endcolumn) {
				for (int i = endRow-1; i >=startRow;--i) {
					sb.append(matrix[i][startColumn]);
					sb.append(", ");
				}
				startColumn++;
			}

		}
		
		System.out.println(sb.toString());

	}

}
