package com.test.arr;

public class MedianOfTwoSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] first = {1,4,8,12,15};
		int[] second = {2,3,7,13,16};
		
		findMedian(first, second);

	}
	
	
	/***
	 * Need to complete this method
	 * @param first
	 * @param second
	 * @return
	 */
	public static int find(int[] first, int[] second){
		if(first.length == 1)
			return second[second.length/2];
		if(second.length == 1)
			return second[first.length/2];
		int median;
		
		int m1 = first[first.length/2] ;
		int m2 = second[first.length/2] ;
		
		if(m1 == m2){
			median = m1;
			return median;
		}
		
		
		
		
		return 0;
		
	}
	
	public static void findMedian(int[] first, int[] second){
		
		int[] merged = MergeTwoSortedArraysIntoSortedOneArray.mergeTwoSortedArrays(first, second);
		
		for (int i : merged) {
			System.out.println(i);
		}
		
		System.out.println("Median : " + merged[merged.length/2]);
		
	}

}
