package com.tree;

public class MirrorImage {

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
		

		root.print(root, 0);

		TreeNode root1 = convertToMirroImage(root);
		System.out.println("-----------------");
		// TreeTraversal.inOrderTraversal(root1);
		root1.print(root1, 0);

//		System.out.println(checkForMirrorImage(root, t));

	}

	public static TreeNode convertToMirroImage(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode leftMirror = convertToMirroImage(root.left);
		TreeNode rightMirror = convertToMirroImage(root.right);

		root.left = rightMirror;
		root.right = leftMirror;

		return root;
	}

	public static boolean checkForMirrorImage(TreeNode r1, TreeNode r2) {
		if (r1 == null && r2 == null)
			return true;
		if (r1 == null || r2 == null)
			return false;

		if (r1.data1 != r2.data1) {
			return false;
		}
		
		return checkForMirrorImage(r1.left, r2.right) && checkForMirrorImage(r1.right, r2.left);

	}

}
