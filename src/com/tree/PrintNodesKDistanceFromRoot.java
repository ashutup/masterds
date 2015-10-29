package com.tree;

public class PrintNodesKDistanceFromRoot {

	/**
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

		

		T.print(T, 0);
		System.out.println("Nodes ---- ");
		printNodes(T, 2);

	}
	
	
	public static void printNodes(TreeNode root,int k){
		if(root == null)
			return;
		
		if(k == 0){
			System.out.println(root.data1);
			return;
		}
		
		printNodes(root.left, k-1);
		printNodes(root.right, k-1);
	}

}
