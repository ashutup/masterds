package com.test.arr;

/***
 * Given an array of n distinct integers sorted in ascending order. Find an
 * index i s.t ar[i] = i. Return -1 if no such index exists. Note that integers
 * in array can be negative.
 * 
 * @author ashutosh.sharma
 * 
 */
public class IndexInArrayWithSameValue {

	public static void main(String[] args) {
		int[] arr = new int[] { 10,10,10,10,10,10,10,10,10,10,10,100,25,25,25,10,10,3,2 };
		findElement(arr);
	}

	public static void findElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(i == arr[i]){
				System.out.println("Index In Array With Same Value " + i);
				break;
			}
		}

	}

}
