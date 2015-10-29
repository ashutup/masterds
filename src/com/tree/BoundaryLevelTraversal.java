package com.tree;

public class BoundaryLevelTraversal {

	private static boolean leftDone = false;
	private static boolean rightDone = false;

	/**
	 * @param args
	 */
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

		System.out.println(root.data1);
		printLeft(root.left);
		printLeaves(root);
		printRight(root.right);

	}

	public static void printLeft(TreeNode root) {
		if(root != null){
			if(root.left != null){
				System.out.println(root.data1);
				printLeft(root.left);
			}
			else if(root.right != null){
				System.out.println(root.data1);
				printLeft(root.right);
			}
		}

	}
	
	public static void printRight(TreeNode root){
		if(root != null){
			if(root.right != null){
				printRight(root.right);
				System.out.println(root.data1);
				
			}
			else if (root.left != null){
				printRight(root.left);
				System.out.println(root.data1);
			}
		}
	}
	
	public static void printLeaves(TreeNode root){
		if(root == null)
			return;
		
		if(root.left == null && root.right == null)
			System.out.println(root.data1);
		
		printLeaves(root.left);
		printLeaves(root.right);
		
		
	}
		
	

}
