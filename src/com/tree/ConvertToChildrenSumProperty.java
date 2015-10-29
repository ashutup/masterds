package com.tree;

public class ConvertToChildrenSumProperty {

	/**
	 * Convert an arbitrary Binary Tree to a tree that holds Children Sum
	 * Property
	 * 
	 * BottomUp Approach
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode n5 = new TreeNode(1, "", null, null);
		TreeNode n15 = new TreeNode(45, "", null, null);

		TreeNode n21 = new TreeNode(31, "", null, null);
		TreeNode n9 = new TreeNode(67, "", null, null);

		n9.left = new TreeNode(87, "", null, null);

		TreeNode n20 = new TreeNode(2, "", n5, n15);
		TreeNode n30 = new TreeNode(6, "", n21, n9);
		TreeNode root = new TreeNode(1, "", n20, n30);

		root.print(root, 0);
		convert(root);
		root.print(root, 0);
	}

	public static void convert(TreeNode node) {
		
		if (node == null)
			return;
		
		if(node.left == null && node.right == null)
			return;
		
		convert(node.left);
		convert(node.right);

		int ld = 0;
		int rd = 0;
		if (node.left != null)
			ld = node.left.data1;

		if (node.right != null)
			rd = node.right.data1;

		if (node.data1 < (ld + rd)) {
			node.data1 = node.data1 + ((ld + rd) - node.data1);
		}else if (node.data1 > (ld + rd)){
			if(node.left != null){
				node.left.data1 = ld + (node.data1 - (ld + rd));
			}else{
				node.right.data1 = rd + (node.data1 - (ld + rd));
			}
		}
	}

}
