package com.test.arr;

public class ReplaceElementWithNextLargerOneInRightSide {

	/**
	 * Given an Array, replace each element in the Array with its Next
	 * Element(To its RHS) which is Larger than it. If no such element exists,
	 * then no need to replace. Ex: i/p: {2,12,8,6,5,1,2,10,3,2}
	 * o/p:{12,12,10,10,10,2,10,10,3,2}
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7,8,9 };
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			buf.append(arr[i] + ", ");
		}
		System.out.println(buf.toString());
		replace(arr);
	}

	public static void replace(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while( j!=arr.length -1){
				if(arr[j+1] > arr[i]){
					arr[i] = arr[j+1];
					break;
				}
				j++;
			}
		}
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			buf.append(arr[i] + ", ");
		}
		System.out.println(buf.toString());
	}

}
