package com.test.arr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Heap {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int arr[] = {3,4,5,6,32,34,56,76,87,89,90,12};
		int n = arr.length;
		System.out.println(stringify(arr));

		
		int i = n/2 -1;
		while (i >= 0) {
			
			heapifyMax(arr, i , n);
			i--;

		}
		System.out.println(stringify(arr));
		
		heapSort(arr);
		
//		int newArr[] = deleteRoot(arr);
//		
//		System.out.println(stringify(newArr));
		

	}
	
	/**
	 * Assuming input as heap structure only
	 * @param arr
	 * @aribaapi private
	 */
	public static void heapSort(int[] arr){
	    
	    int n = arr.length;
	    
	    while(n > 0){
	        int temp = arr[n-1];
	        arr[n-1] = arr[0];
	        arr[0] = temp;
	        
	        n--;
	        heapifyMax(arr, 0, n);
	        
	    }
	    
	    System.out.println(stringify(arr));
	    
	}
	
	public static int[] deleteRoot(int[] arr){
	    int n = arr.length;
	    
	    int temp = arr[n-1];
	    arr[n-1] = arr[0];
	    arr[0] = temp;
	    
	    int newArr[] = new int[n-1];
	    
	    for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
	    
	    heapifyMax(newArr, 0, n-1);
	    
	    
	    return newArr;
	    
	}
	
	public static void heapifyMax(int arr[], int i , int n) {
	    int max;
	    int left = 2*i + 1;
	    int right = 2*i + 2;
	    
	    if(left < n && arr[left] > arr[i])
	        max = left;
	    else
	        max = i;
	    
	    if(right < n && arr[right] > arr[max])
	        max = right;
	    
	    if(max != i){
	        int temp = arr[i];
	        arr[i] = arr[max];
	        arr[max] = temp;
	        
	        heapifyMax(arr, max, n);
	    }
	    
	    
	}

	public static void heapifyMin(int arr[], int i,int n) {
		int min;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && arr[left] < arr[i])
			min = left;
		else
			min = i;

		if (right < n && arr[right] < arr[min])
			min = right;

		if (min != i) {
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			heapifyMin(arr, min , n);
		}
	}

	

	public static String stringify(int arr[]) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list.toString();

	}

}
