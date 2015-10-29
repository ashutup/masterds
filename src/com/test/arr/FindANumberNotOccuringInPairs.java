package com.test.arr;

import java.util.HashMap;
import java.util.Map;

public class FindANumberNotOccuringInPairs {

	/**
	 * Q- Given an array where all numbers but one occurs in pairs, suggest all
	 * ways to find the unique number. What if the array was sorted? (Code)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[]{1,1,2,2,5,5,7,7,99,99,0,3,3,12,12,43,43,8,8};
		
		nonPairedIntegerSimple(arr);
		
//		nonPairedIntegerUsingHashMap(arr);
				
	}
	
	/***
	 * Non sorted Array
	 * @param arr
	 */
	public static void nonPairedIntegerUsingHashMap(int[] arr){
		Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		
		for (int i : arr) {
			if(map.containsKey(i)){
				map.remove(i);
			}else{
				map.put(i, true);
			}
		}
		
		System.out.println("Single numbers : " + map.keySet());
		
	}
	
	
	/***
	 * Guess this solutions holds good for sorted array
	 * @param arr
	 */
	public static void nonPairedIntegerSimple(int[] arr){
		for (int i = 0; i < arr.length; i=i+2) {
			if(i ==  arr.length - 1){
				System.out.println("single Elment is " + arr[i]);
				break;
			}
			if(arr[i] != arr[i+1]){
				System.out.println("single Elment is " + arr[i]);
//				break;
			}
		}
	}

}
