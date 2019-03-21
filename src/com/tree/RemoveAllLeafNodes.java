package com.tree;

public class RemoveAllLeafNodes {

	public static void main(String[] args) {
		TreeNode root = TreeNode.getBinaryTree();
		
		root.print(root, 0);
		deleteAllLeafs(root);
		
		root.print(root, 0);

	}
	
	public static TreeNode deleteAllLeafs(TreeNode root){
		if(root == null)
			return null;
		
		if(root.isLeaf()){
			return null;
		}
		
		root.left = deleteAllLeafs(root.left);
		root.right = deleteAllLeafs(root.right);
		
		return root;
	}

}
