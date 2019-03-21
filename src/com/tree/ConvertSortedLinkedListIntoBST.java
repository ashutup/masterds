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

		TreeNode root = convert(head.length());

		root.print(root, 1);

		System.out.println("Count " + count);
	}

	public static TreeNode convert(int size) {
		// base case
		if (size <= 0)
			return null;

		TreeNode left = convert(size / 2);

		TreeNode root = new TreeNode();

		root.data1 = head.data1;

		root.left = left;

		head = head.next;

		root.right = convert(size - size / 2 - 1);

		return root;
	}

}
