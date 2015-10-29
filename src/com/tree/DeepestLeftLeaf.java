package com.tree;

public class DeepestLeftLeaf {
	
	
	private static final int LEFT = 0, RIGHT = 1;
	private static int deepest = -1;
	private static TreeNode deepestLeftLeafNode = null;

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
		
		deepestLeftLeafNode = root;
		deppestLeftLeaf(root, -1, 0);
		System.out.println("Deepest Leaf Node : " + deepestLeftLeafNode.data1);
	}
	
	
	public static void deppestLeftLeaf(TreeNode root, int childType, int d){
		if(root == null)
			return;
		if(root.left == null && root.right == null ){
			if(d > deepest && childType == LEFT){
				deepest = d;
				deepestLeftLeafNode = root;
			}
			return;
		}
		
		deppestLeftLeaf(root.left, LEFT, d+1);
		deppestLeftLeaf(root.right, RIGHT, d+1);
		
	}

}
