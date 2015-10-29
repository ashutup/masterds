package com.tree;

public class PrintAncestorsOfNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// FIXME Auto-generated method stub
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
		
		root.print(root, 0);
		printAncestors(root, 3);

	}
	
	
	public static boolean printAncestors(TreeNode root, int key){
		if(root == null)
			return false;
		
		if(root.data1 ==  key){
			return true;
		}
		
		if(printAncestors(root.left, key) || printAncestors(root.right, key)){
			System.out.println(root.data1);
			return true;
		}
			
		return false;
		
	}

}
