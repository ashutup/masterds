package com.test.arr;

public class FindClosestElementToK {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {-10,-4,1,2,6,7,8,9,20,21,34,50,51};
		int num = 8;
		if(num <= arr[0]){
			System.out.println("Closest number " + arr[0]);
			return;
		}
		if(num >= arr[arr.length-1]){
			System.out.println("Closest number " + arr[arr.length-1]);
			return;
		}
		
//		findClosest(arr, 9);
		findClosestBinary(arr, num, 0, arr.length);
	}
	
	
	public static void findClosest(int[] arr,int num){
		int minDifference =  Integer.MAX_VALUE;
		int closest = 0;
		for (int i : arr) {
			if(i-num == 0){
				System.out.println(i + " is the closest one");
				return;
			}
			if(Math.abs(num -i) < minDifference){
				minDifference = Math.abs(num -i);
				closest = i;
			    System.out.println("min difference " + minDifference + "closest " + closest);
			}
		}
		System.out.println("closest : " + closest);
	}
	
	public static void findClosestBinary(int[] arr,int num,int start, int end){
		
		int mid = (start+end)/2;
		
		//base cases
		if(arr[mid] == num){
			System.out.println("Number itself Present in Array so it is closest to itself : " + arr[mid]);
			return;
		}
		
		if(mid == 0 && num > arr[mid] && num <= mid +1){
			getClosest(num, arr[mid], arr[mid+1]);
			return;
		}
		
		if(num > arr[mid-1] && num < arr[mid]){
			getClosest(num, arr[mid-1], arr[mid]);
			return;
		}
		
		if(mid == arr.length-1 && num >= mid-1 && num < mid){
			getClosest(num, arr[mid-1], arr[mid]);
			return;
		}
		
		if(num > arr[mid] && num <= arr[mid+1]){
			getClosest(num, arr[mid], arr[mid+1]);
			return;
		}
		
		if(num > arr[mid] && num >= arr[mid+1]){
			findClosestBinary(arr, num, mid+1, end);
		}
		
		if(num < arr[mid] && num <= arr[mid-1]){
			findClosestBinary(arr, num, start, mid-1);
		}
	}
	
	public static void getClosest(int num, int first, int second) {
		if (Math.abs(num - first) == Math.abs(num - second)) {
			System.out.println("Both are closest : " + first + " AND " + second);
		} else if (Math.abs(num - first) < Math.abs(num - second)) {
			System.out.println("Closest " + first);
		} else if (Math.abs(num - first) > Math.abs(num - second)) {
			System.out.println("Closest " + second);
		}
	}

}
