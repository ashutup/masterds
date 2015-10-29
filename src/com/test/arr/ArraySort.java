package com.test.arr;

import java.util.Arrays;

public class ArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "khxiewbcuyfgrbdscbyiwfvgoqcoqcbiqycgvicgnqiudgb7et23873bd328dxf2bnz187fg21nxz32x23509c9475n4865cb436c4654c5b3xb43683658346x58347768926b9cm9b62c45634289756c3846c78c65b56325cb63586c3";

		
		char[] charArr = str.toCharArray();
		
		Arrays.sort(charArr);
		
		StringBuffer buf = new StringBuffer();
		
		for (char c : charArr) {
			buf.append(c);
		}
		
		System.out.println(buf.toString());
	}

}
