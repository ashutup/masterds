package com.tree;

public class LevelOrderTraversal {
	
	private static boolean leftToRight = false;

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
		TreeNode root = new TreeNode(50, "", n20, n30);
        
		
		root.print(root, 0);
		System.out.println("Height of a tree " + findHeight(root));
//		System.out.println(TreeTraversal.heightOfTree(root));
		
		
		int h = findHeight(root);
		for(int i=1 ; i <= h ; i++){
			levelOrder(root, i);
			if(leftToRight)
				leftToRight = false;
			else
				leftToRight = true;
		}
	}
	
	
	public static void levelOrder(TreeNode root, int level){
		if(root == null)
			return;
		if(level == 1){
			System.out.println(root.data1);
			
		}else if(leftToRight){
			
			levelOrder(root.left, level-1);
			levelOrder(root.right, level-1);
			
		}
		else{
			levelOrder(root.right, level-1);
			levelOrder(root.left, level-1);
		}
	}
	
	
	public static int findHeight(TreeNode root){
		if(root == null)
			return 0;
		
		return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
	}
	
	
	

}
