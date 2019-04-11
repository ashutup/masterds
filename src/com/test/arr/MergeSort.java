package com.test.arr;

/**
 * MergeSort(arr[], l,  r)
	If r > l
	     1. Find the middle point to divide the array into two halves:  
	             middle m = (l+r)/2
	     2. Call mergeSort for first half:   
	             Call mergeSort(arr, l, m)
	     3. Call mergeSort for second half:
	             Call mergeSort(arr, m+1, r)
	     4. Merge the two halves sorted in step 2 and 3:
                 Call merge(arr, l, m, r)
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {100,99,98 };

		printArray(arr);
		sort(arr, 0, arr.length - 1);

		printArray(arr);

	}

	public static void sort(int[] arr, int left, int right) {

		if (left < right) {

			int m = (left + right) / 2;

			sort(arr, left, m);
			sort(arr, m + 1, right);

			merge(arr, left, m, right);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int left[] = new int[n1];
		int right[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			left[i] = arr[l + i];
		}
		for (int i = 0; i < n2; i++) {
			right[i] = arr[m + 1 + i];
		}

		int i = 0, j = 0;
		int k = l;

		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = left[i];
			k++;
			i++;
		}

		while (j < n2) {
			arr[k] = right[j];
			k++;
			j++;
		}

	}
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

}
