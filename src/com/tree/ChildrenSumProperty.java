package com.tree;

public class ChildrenSumProperty {

	/**
	 * Given a binary tree, write a function that returns true if the tree
	 * satisfies below property.
	 * 
	 * For every node, data value must be equal to sum of data values in left
	 * and right children. Consider data value as 0 for NULL children. Below
	 * tree is an example
	 * 
	 * 
	 * 
	 * Algorithm: Traverse the given binary tree. For each node check
	 * (recursively) if the node and both its children satisfy the Children Sum
	 * Property, if so then return true else return false.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode n5 = new TreeNode(5, "", null, null);
		TreeNode n15 = new TreeNode(15, "", null, null);

		TreeNode n21 = new TreeNode(21, "", null, null);
		TreeNode n9 = new TreeNode(9, "", null, null);

		n9.left = new TreeNode(8, "", null, null);

		TreeNode n20 = new TreeNode(20, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n21, n9);
		TreeNode root = new TreeNode(50, "", n20, n30);

		System.out.println(isSatisfyingChildrenSumProperty(root));
		root.print(root, 0);

	}

	public static boolean isSatisfyingChildrenSumProperty(TreeNode node) {
		if (node == null) {
			return true;
		}
		if (node.left == null && node.right == null) {
			return true;
		} else {
			int left = 0;
			int right = 0;
			if (node.left != null)
				left = node.left.data1;

			if (node.right != null)
				right = node.right.data1;

			return (node.data1 == left + right)
					&& isSatisfyingChildrenSumProperty(node.left)
					&& isSatisfyingChildrenSumProperty(node.right);
		}
	}

}
