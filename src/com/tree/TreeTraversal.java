package com.tree;

public class TreeTraversal {
	
	static int size = 0;

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
		
		root.print(root, 10);

		System.out.println("InOrder Traversal");
		inOrderTraversal(root);
		System.out.println("\n");
		
		System.out.println("PreOrder Traversal");
		preOrderTraversal(root);
		System.out.println("\n");
		
		System.out.println("PostOrder Traversal");
		postOrderTraversal(root);
		
		
		System.out.println("Size of the tree : " + sizeOfTree(root));
		
		
		System.out.println("Height of the tree : " + heightOfTree(root));

	}
	
	public static int heightOfTree(TreeNode root) {
		if (root == null)
			return 0;
		
		int l = heightOfTree(root.left);
		int r = heightOfTree(root.right);
		
		if(l > r)
			return l+1;
		else return r+1;
	}
	
	public static int sizeOfTree(TreeNode root) {
		if (root == null)
			return 0;
		
		return sizeOfTree(root.left) + sizeOfTree(root.right) + 1 ;

	}

	public static void inOrderTraversal(TreeNode root) {
		if (root == null)
			return;

		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);

	}

	public static void preOrderTraversal(TreeNode root) {
		if (root == null)
			return;

		System.out.println(root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);

	}
	
	
	public static void postOrderTraversal(TreeNode root) {
		if (root == null)
			return;

		postOrderTraversal(root.right);
		System.out.println(root.data);
		postOrderTraversal(root.left);
	}

}
