package com.tree;

public class ConstructBSTFromPreOrderTraversal {
	// private static TreeNode root = new TreeNode();
	
	private static int idx = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] p = {5,3,2,4,7,6,8};

		TreeNode root = convert(p, Integer.MIN_VALUE, Integer.MAX_VALUE);

		root.print(root, 0);

	}

	public static TreeNode convert(int[] p, int min, int max) {
		if (idx >= p.length)
			return null;
		

		TreeNode root = null;

		if (p[idx] > min && p[idx] < max) {
			
			root = new TreeNode();
			root.data1 = p[idx];

			idx = idx + 1;
			
			root.left = convert(p, min, root.data1);
				
			
			root.right = convert(p, root.data1, max);
			
			
		}

		return root;
	}

}
