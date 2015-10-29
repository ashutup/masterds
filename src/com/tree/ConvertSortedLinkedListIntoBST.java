package com.tree;

import com.list.Node;

public class ConvertSortedLinkedListIntoBST {
	
	public static int count = 0;
	public static Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 head = new Node();
		head.appendToTail(1);
		head.appendToTail(2);
		head.appendToTail(3);
		head.appendToTail(4);
		head.appendToTail(5);
		head.appendToTail(6);
		head.appendToTail(7);
		

		TreeNode root = convert(0 , head.length()-1);

		root.print(root, 1);
		
		System.out.println("Count " + count);
	}

	public static TreeNode convert(int start , int end ) {
		// base case
		if (start > end)
			return null;
//		count++;
		int mid = start + (end - start) / 2;

		TreeNode left = convert( start, mid - 1);

		TreeNode root = new TreeNode();

		root.data1 = head.data1;

		root.left = left;
		
		head = head.next;

		root.right = convert( mid + 1, end);

		return root;
	}

}
