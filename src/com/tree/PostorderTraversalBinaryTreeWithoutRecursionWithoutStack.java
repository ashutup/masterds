package com.tree;

public class PostorderTraversalBinaryTreeWithoutRecursionWithoutStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = TreeNode.getBinaryTree();
		root.print(root, 0);
		postOrder(root);

	}
	
	public static void postOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		TreeNode temp = root;
		
		while(temp != null && temp.visited == false) {
			
			if(temp.left != null && temp.left.visited == false)
				temp = temp.left;
			else if(temp.right != null && temp.right.visited == false)
				temp = temp.right;
			else
			{
				System.out.println(temp.data1);
				temp.visited = true;
				temp = root;
			}
			
		}
	}

}
