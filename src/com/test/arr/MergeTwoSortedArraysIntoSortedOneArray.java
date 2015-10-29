package com.test.arr;

public class MergeTwoSortedArraysIntoSortedOneArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] first	= { 1, 2, 5, 6, 9 };
		int[] second = { 3,4,7,8,14,15,16,17,18,200 };
		
		
		int[] mergedArr = mergeTwoSortedArrays(first,second);
		for (int i : mergedArr) {
			System.out.println(i);
		}
	}

	public static int[] mergeTwoSortedArrays(int[] first, int[] second) {
		int totalLength = first.length + second.length;
		int[] mergedArr = new int[totalLength];
		
		int f = 0;
		int s = 0;
		int m = 0;
		while(f <= first.length -1 && s <= second.length - 1){
			if(first[f] < second[s]){
				mergedArr[m] = first[f];
				f++;
			}else{
				mergedArr[m] = second[s];
				s++;
			}
			m++;
		}
		
		while(f <= first.length - 1){
			mergedArr[m] = first[f];
			m++;
			f++;
		}
		
		while(s <= second.length - 1){
			mergedArr[m] = second[s];
			m++;
			s++;
		}
		
		return mergedArr;
	}

}
