package com.test.arr;

public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// FIXME Auto-generated method stub

		System.out.println(power(2, 10));

	}

	public static int power(int x, int y) {
		if (y == 0) {
			return 1;
		}

		int temp = power(x, y / 2);

		if (y % 2 == 0) {
			return temp * temp;
		} else {
			return x * temp * temp;
		}
	}

}
