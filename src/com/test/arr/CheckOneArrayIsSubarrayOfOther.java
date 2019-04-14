package com.test.arr;

public class CheckOneArrayIsSubarrayOfOther {

	/**
	 * 
	 * Given two arrays A[] and B[] consisting of n and m integers. The task is to
	 * check whether the array B[] is a subarray of the array A[] or not.
	 * 
	 * Examples:
	 * 
	 * Input : A[] = {2, 3, 0, 5, 1, 1, 2}, B[] = {3, 0, 5, 1} Output : Yes
	 * 
	 * Input : A[] = {1, 2, 3, 4, 5}, B[] = {2, 5, 6} Output : No
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
  
        int A[] = { 2, 3, 0, 5, 1, 1, 2 }; 
        int B[] = { 3, 0, 5, 1 }; 
        
        int i = 0, j=0;
        
        while(i < A.length && j < B.length) {
        	if(A[i] == B[j]) {
        		i++;
        		j++;
        	}else {
        		i++;
        	}
        }
        
        if(j == B.length) {
        	System.out.println("True");
        }else {
        	System.out.println("False");
        }
        

	}

}
