package com.tree;

public class DeleteNodeFromBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode n5 = new TreeNode(5, "", null, null);
		TreeNode n15 = new TreeNode(15, "", null, null);

		TreeNode n25 = new TreeNode(25, "", null, null);
		TreeNode n40 = new TreeNode(40, "", null, null);

		TreeNode n10 = new TreeNode(10, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n25, n40);
		TreeNode root = new TreeNode(20, "", n10, n30);

		root.print(root, 0);
		
		delete(root,20);
		System.out.println("After Deletion -- ");
		root.print(root, 0);

	}
	
	
	
	public static TreeNode delete(TreeNode root, int n) {
		if (root == null)
			return null;

		if (n < root.data1) {
			root.left = delete(root.left, n);
		} else if (n > root.data1) {
			root.right = delete(root.right, n);
		} else {
			
			if(root.left == null){
				TreeNode temp = root.right;
				return temp;
			}
			else if(root.right == null){
				TreeNode temp = root.left;
				return temp;
			}
			int temp = InorderSuccessor.findInorderSuccessor(root, root.data1).data1;
			root.data1 = temp;
			
			root.right = delete(root.right, temp);
					

		}

		return root;

	}

}
