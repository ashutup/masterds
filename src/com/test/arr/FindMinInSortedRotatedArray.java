package com.test.arr;

public class FindMinInSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr = { 45, 47, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67,68, 69, 70,80,90,100,200,300,400,500,600,700,800,9000,10000,1,2,3,4,5,6,7,8,9,10 };
		findMin(arr, 0, arr.length - 1);
	}

	public static void findMin(int[] arr, int low, int high) {
		//Array Sorted Only --- NOT ROTATED
		if(arr[low] < arr[high]){
			System.out.println("Min Element " + arr[low]);
			return;
		}
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid - 1] > arr[mid]) {
				System.out.println("Min Element " + arr[mid]);
				return;
			} else {
				if (arr[low] <= arr[mid]) {
					System.out.println("Shifting to right sub array");
					low = mid + 1;
				} else {
					System.out.println("Shifting to left sub array");
					high = mid - 1;
				}

			}
		}

	}

}
