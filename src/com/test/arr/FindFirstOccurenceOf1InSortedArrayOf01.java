package com.test.arr;

public class FindFirstOccurenceOf1InSortedArrayOf01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1};
		int i = 0;
		int j = arr.length - 1;
		
		int mid = 0;
		while(i<j){
			mid = (i+j)/2;
			
			if(arr[mid] == 1 && arr[mid-1] == 0){
				System.out.println("first occurence of 1 : " + mid);
				break;
			}
			
			if(arr[mid] == 0 && arr[mid+1] == 1){
				System.out.println("first occurence of 1 : " + (mid+1));
				break;
			}
			
			if(arr[mid] == 0){
				i = mid + 1;
			}
			
			if(arr[mid] == 1){
				j = mid - 1;
			}
		}
	}

}
