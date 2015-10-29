package com.test.arr;

import java.util.ArrayList;
import java.util.List;

public class PathIn2DMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// int[][] matrix =
		// {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(noOfPaths(4,4));
		System.out.println(noOfPathsWithoutRecursion(4,4));

	}

	public static int noOfPaths(int x, int y) {
		//Lets suppose this point is not reachable
//		if (x == 2 && y == 2){
//			return 0;
//		}
		
		if (x == 1 || y == 1)
			return 1;

		return noOfPaths(x - 1, y) + noOfPaths(x, y - 1);

	}

	public static int noOfPathsWithoutRecursion(int x, int y) {
		int[][] count = new int[x][y];
		
		for(int i = 0 ; i < x ; i ++){
			count[i][0] = 1;
		}
		
		for(int j = 0 ; j < y ; j ++){
			count[0][j] = 1;
		}
		
		for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				count[i][j] = count[i-1][j] + count[i][j-1];
			}
		}

		return count[x-1][y-1];

	}

	public static boolean getPath(int x, int y, List<Point> path) {

		path.add(new Point(x, y));
		if (x == 0 && y == 0) {

			System.out.println("Path Found");
			return true;
		}

		boolean success = false;
		success = getPath(x - 1, y, path);

		if (!success)
			success = getPath(x, y - 1, path);

		return success;
	}

	private static boolean isFree(Point p) {
		if (p.x == 2 || p.y == 3)
			return true;

		return false;
	}

}
