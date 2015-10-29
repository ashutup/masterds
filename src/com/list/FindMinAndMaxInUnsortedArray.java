package com.list;

public class FindMinAndMaxInUnsortedArray {

	public static void main(String[] args) {
		int[] arr = new int[]{11,12,-10000,13,14,15,14,16,17,18,19,5000,123,321,1000,3,3,4,2,44,55,234,5,6,8,9,1,2,4,5,6,78,54,78,54,33,65,87,9,12,3,4,5678,9,8,34,2};
		
		findMinMax(arr);
	}
	
	
	/***
	 * 
	 * @param arr
	 */
	public static void findMinMax(int[] arr){
		int min = arr[0];
		int max = arr[0];
		
		for (int i : arr) {
			if(i < min){
				min = i;
			}
			if(i > max){
				max = i;
			}
		}
		System.out.println("MAX : " + max);
		System.out.println("MIN : " + min);
	}

}
