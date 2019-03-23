package com.tree;

public class CheckForFoldableBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode n2 = new TreeNode(2, "", null, null);
		TreeNode n8 = new TreeNode(8, "", null, null);
		TreeNode n50 = new TreeNode(50, "", null, null);
		TreeNode n5 = new TreeNode(5, "", n2, null);
		
		TreeNode n3 = new TreeNode(3, "", null, null);
		TreeNode n12 = new TreeNode(12, "", null, null);
		TreeNode n15 = new TreeNode(15, "", n12, null);
		TreeNode n28 = new TreeNode(28, "", null, null);
		TreeNode n25 = new TreeNode(25, "", null, n28);
		TreeNode n40 = new TreeNode(40, "", null, n50);
		
		

		TreeNode n10 = new TreeNode(10, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n25, n40);
		TreeNode root = new TreeNode(20, "", n10, n30);
		root.print(root, 0);
		System.out.println(isFoldable(root));
	}
	
	public static boolean isFoldable(TreeNode root){
		if(root == null)
			return true;
		
		return isFoldable(root.left, root.right);
	}
	
	private static boolean isFoldable(TreeNode root1, TreeNode root2){
		if(root1 == null && root2 == null){
			return true;
		}
		
		if(root1 == null || root2 == null){
			return false;
		}
		
		return isFoldable(root1.left, root2.right) && isFoldable(root1.right, root2.left);
	}
	
	
	public static boolean print(TreeNode root, int key){
		if(root == null){
			return false;
		}
		
		if(root.data1 == key)
			return true;
		
		if(print(root.left, key) || print(root.right, key)){
			System.out.println(root.data1);
			return true;
		}
		return false;
	}
	
	

}
