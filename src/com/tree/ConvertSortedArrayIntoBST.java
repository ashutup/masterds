package com.tree;

public class ConvertSortedArrayIntoBST {
	static int[] arr = {1,2,3,4,5,6,7,8,9};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = convert(0, arr.length-1);
		root.print(root, 1);
	}
	
	public static TreeNode convert(int left, int right){
		System.out.println("left = " + left + " , right = " + right);
		//base case
		if(left > right){
			return null;
		}
		int middle = (left + right) / 2;
		System.out.println(middle);
		TreeNode root = new TreeNode(arr[middle],convert(left, middle-1),convert(middle+1, right));
		
		
		return root;
	}

}
