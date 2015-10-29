package com.tree;

public class TreeDistanceWithLeft1AndRight2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode n2 = new TreeNode(2, "", null, null);
		TreeNode n8 = new TreeNode(8, "", null, null);
		TreeNode n50 = new TreeNode(50, "", null, null);
		TreeNode n5 = new TreeNode(5, "", n2, n8);
		TreeNode n12 = new TreeNode(12, "", null, null);
		TreeNode n15 = new TreeNode(15, "", n12, null);
		TreeNode n28 = new TreeNode(28, "", null, null);
		TreeNode n25 = new TreeNode(25, "", null, n28);
		TreeNode n40 = new TreeNode(40, "", null, n50);
		
		

		TreeNode n10 = new TreeNode(10, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n25, n40);
		TreeNode root = new TreeNode(20, "", n10, n30);
		
		
//		root.print(root, 0);
		printNodesWithDistanceK(root,5, 0);
		
	}
	
	
	public static void printNodesWithDistanceK(TreeNode root, int k, int d){
		if(root == null)
			return;
		
		if(d > k){
			System.out.println("Returning due to d > k");
			return;
		}
		
		printNodesWithDistanceK(root.left, k, d+1);
		
		
		if(k == d){
			System.out.println(root.data1);
		}
		
		printNodesWithDistanceK(root.right, k, d+2);
		
	}

}
