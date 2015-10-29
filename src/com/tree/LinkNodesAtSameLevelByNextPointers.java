package com.tree;

public class LinkNodesAtSameLevelByNextPointers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode n5 = new TreeNode(5, "", null, null);
		TreeNode n15 = new TreeNode(15, "", null, null);

		TreeNode n21 = new TreeNode(21, "", null, null);
		TreeNode n9 = new TreeNode(9, "", null, null);

		

		TreeNode n20 = new TreeNode(20, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n21, n9);
		TreeNode root = new TreeNode(50, "", n20, n30);
        
		
		root.print(root, 0);
		
//		LinkToNext(root, TreeTraversal.heightOfTree(root));
		linkToNextUsingPreorder(root);
		
		System.out.println("----");
		printNext(root);

	}
	
	/***
	 * This methods works only for complete binary tree
	 * @param root
	 */
	public static void linkToNextUsingPreorder(TreeNode root){
		if(root == null)
			return;
		
		if(root.left != null)
			root.left.next = root.right;
		
		if(root.right != null)
			root.right.next = root.next != null ? root.next.left : null;
		
		linkToNextUsingPreorder(root.left);
		linkToNextUsingPreorder(root.right);
		
	}
	
	
	
	
	public static TreeNode LinkToNext(TreeNode root,int h){
		if(root == null)
			return null;
		
		if(h == 1)
			return root;
		
			TreeNode left = LinkToNext(root.left, h-1);
			if(left!= null){
				left.next = LinkToNext(root.right, h-1);
			}
		
		
		return root;
		
	}
	
	public static void printNext(TreeNode root){
		if(root == null)
			return;
		
		printNext(root.left);
		
		System.out.println(root.data1+"->"+(root.next != null ? root.next.data1 : null));
		
		printNext(root.right);
	}

}
