package com.tree;

public class CheckForSiblings {

	public static void main(String[] args) {
		TreeNode n2 = new TreeNode(2, "", null, null);
		TreeNode n8 = new TreeNode(8, "", null, null);
		TreeNode n50 = new TreeNode(50, "", null, null);
		TreeNode n5 = new TreeNode(5, "", n2, n8);

		TreeNode n3 = new TreeNode(3, "", null, null);
		TreeNode n12 = new TreeNode(12, "", n3, null);
		TreeNode n15 = new TreeNode(15, "", n12, null);
		TreeNode n28 = new TreeNode(28, "", null, null);
		TreeNode n25 = new TreeNode(25, "", null, n28);
		TreeNode n40 = new TreeNode(40, "", null, n50);

		TreeNode n10 = new TreeNode(10, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n25, n40);
		TreeNode root = new TreeNode(20, "", n10, n30);

		root.print(root, 1);
		System.out.println(areSiblings(n25, n40, root));
	}

	public static boolean areSiblings(TreeNode n1, TreeNode n2, TreeNode root) {
		if (root == null)
			return false;

		if ((root.left == n1 && root.right == n2)
				|| (root.left == n2 && root.right == n1)) {
			return true;
		}

		return areSiblings(n1, n2, root.left)
				|| areSiblings(n1, n2, root.right);
	}

}
