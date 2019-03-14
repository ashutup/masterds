package com.tree;

public class CheckForBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = TreeNode.getBST();
		System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		System.out.println(isBST(TreeNode.getBinaryTree(), Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
	public static boolean isBST(TreeNode root, int min, int max){
		if(root == null){
			return true;
		}
		
		if(root.data1 < min || root.data1 > max){
			return false;
		}
		
		return isBST(root.left, min, root.data1-1) && isBST(root.right, root.data1+1, max);
	}

}
