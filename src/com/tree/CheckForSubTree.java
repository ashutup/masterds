package com.tree;

public class CheckForSubTree {

	/**
	 * Check if a binary tree is subtree of another binary tree
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode n5 = new TreeNode(5, "", null, null);
		TreeNode n15 = new TreeNode(15, "", null, null);

		TreeNode n21 = new TreeNode(21, "", null, null);
		TreeNode n9 = new TreeNode(9, "", null, null);

		n9.left = new TreeNode(8, "", null, null);
		n9.right = new TreeNode(100, "", null, null);

		TreeNode n20 = new TreeNode(20, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n21, n9);
		TreeNode T = new TreeNode(50, "", n20, n30);

		TreeNode S = n30;

		T.print(T, 0);
		S.print(S, 0);
		
		System.out.println("Is Identical : " + isIdentical(T, S));
		
		System.out.println("Is Subtree : " + isSubTree(T, S));
	}

	public static boolean isIdentical(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;

		return (root1.data1 == root2.data1
				&& isIdentical(root1.left, root2.left) && isIdentical(
					root1.right, root2.right));
	}
	
	
	public static boolean isSubTree(TreeNode T,TreeNode S){
		if(S == null)
			return true;
		if(T == null)
			return false;
		
		if(isIdentical(T, S))
			return true;
		
		return isSubTree(T.left, S) || isSubTree(T.right, S);
	}

}
