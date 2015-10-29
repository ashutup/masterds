/**
 * 
 */
package com.test.arr;

/**
 * @author Ashutosh.Sharma
 * 
 */
public class SearchInSortedMatrix {

	/**
	 * Search in a row wise and column wise sorted matrix
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 10 }, 
		                { 4, 5, 6, 20 }, 
		                { 7, 8, 21,30 } };

		search(arr, 29);
	}

	public static void search(int[][] arr, int numberToFind) {
		int N = arr[0].length;

		int columns = arr[0].length;
		int rows = arr.length;

		if (numberToFind < arr[0][0]) {
			System.out.println("Not Exists !!!");
			return;
		}

		if (numberToFind > arr[rows - 1][columns - 1]) {
			System.out.println("Not Exists !!!");
			return;
		}

		System.out.println("Number May Exists !!!");

		int currentRow = 0;
		int currentCol = columns - 1;

		while (currentCol >= 0 && currentRow <= rows - 1) {
			if (numberToFind == arr[currentRow][currentCol]) {
				System.out.println("Number Found At Position : " + currentRow
						+ "," + currentCol);
				break;
			}

			if (numberToFind < arr[currentRow][currentCol]) {
				currentCol--;
			} else {
				currentRow++;
			}
		}
		
		if(currentCol < 0 || currentRow > rows - 1){
		    System.out.println("Not Found !!!");
		}

	}

}
