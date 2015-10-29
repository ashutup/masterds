package com.test.arr;

import java.util.BitSet;

public class BitSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BitSet bitSet = new BitSet();
		bitSet.set(0);
		bitSet.set(1);
		bitSet.set(2);
		bitSet.set(3);
		bitSet.set(4);
		
		System.out.println(bitSet.size());
		System.out.println(bitSet.length());
	}

}
