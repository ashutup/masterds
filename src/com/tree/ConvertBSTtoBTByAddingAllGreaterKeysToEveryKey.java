package com.tree;

public class ConvertBSTtoBTByAddingAllGreaterKeysToEveryKey {
	
	static int sum = 0;

	public static void main(String[] args) {
		TreeNode root= TreeNode.getBST();
		
		root.print(root, 0);
		
		convert(root);
		
		root.print(root, -5);
	}
	
	public static void convert(TreeNode root){
		if(root == null){
			return;
		}
		
		convert(root.right);
		
		sum = sum + root.data1;
		root.data1 = sum;
		
		convert(root.left);
	}

}
