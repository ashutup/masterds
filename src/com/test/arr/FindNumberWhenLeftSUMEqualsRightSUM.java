package com.test.arr;

public class FindNumberWhenLeftSUMEqualsRightSUM {

	/**
	 * You are given an array of integers. You have to find the index in array
	 * from where (sum of left elements)=(sum of right elements). The elements
	 * itself is excluded.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 12,8,4,3,2,1,2 };
		
	    

//		findNumber(arr);
//
//		System.out.println("---------------------");

		findNumberInSinglePass(arr);
	}

	public static void findNumberInSinglePass(int[] arr) {
		printArray(arr);
		
		int leftSum = 0;
		int rightSum = 0;

		int i = 0;
		int j = arr.length - 1;

		boolean leftReset = true;
		boolean rightReset = true;
		

		while (i < j) {
			if (leftReset)
				leftSum = leftSum + arr[i];

			if (rightReset)
				rightSum = rightSum + arr[j];

			if (leftSum < rightSum) {
				i++;
				
				leftReset = true;
				rightReset = false;
			} else if (leftSum > rightSum) {
				j--;
				leftReset = false;
				rightReset = true;
			} else if (leftSum == rightSum && (i == (j-2))) {
				System.out.println("Mid element : " + arr[i+1] + " at index " +( i+1));
			}
			else{
				i++;
				j--;
				leftReset = true;
				rightReset = true;
			}
		}

	}

	/***
	 * Lets consider an array of +ve integers O(n2) worst case
	 * 
	 * @param arr
	 */
	public static void findNumber(int[] arr) {
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// FIXME Auto-generated catch block
			e.printStackTrace();
		}
		int mid = -1;
		int leftSum = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			int rightSum = 0;
			mid = i;
			leftSum = leftSum + arr[mid - 1];
			for (int j = i + 1; j < arr.length; j++) {
				rightSum = rightSum + arr[j];
				if (leftSum < rightSum) {
					break;
				}
				if ((leftSum == rightSum) && (j == arr.length - 1)) {
					System.out.println("Mid element : " + arr[i] + " at index "	+ i);
				}
			}

		}
		long end = System.currentTimeMillis();
		System.out.println("Total time : " + (end - start));
	}

	public static void printArray(int[] arr) {
		StringBuffer buf = new StringBuffer();
		for (int i : arr) {
			buf.append(i + " , ");
		}
		System.out.println(buf.toString());
	}

}
