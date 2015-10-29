package com.test.arr;





public class HeightOfBinaryTree {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode("CEO", null, null);

		TreeNode VP1 = new TreeNode("VP1", null, null);

		TreeNode VP2 = new TreeNode("VP2", null, null);
		TreeNode D1 = new TreeNode("D1", null, null);
		TreeNode D2 = new TreeNode("D2", null, null);
		TreeNode D3 = new TreeNode("D3", null, null);
		TreeNode D4 = new TreeNode("D4", null, null);
		

		root.left = VP1;
		root.right = VP2;

		VP1.left = D1;
		VP1.right = D2;
		

		VP2.left = D3;
		VP2.right = D4;
		
		int height = getHeight(root);
		System.out.println(height);
	}
	
	public static int getHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		if(left > right)
			return left + 1;
		else
			return right + 1;
	}

}
