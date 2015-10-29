package com.tree;

public class IdenticalTrees {

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
		
		
		TreeNode t2 = root;
		
		
		System.out.println("Is Both Trees Identical " + isIdentical(root, t2));
	}
	
	
	
	public static boolean isIdentical(TreeNode t1, TreeNode t2){
		if(t1 == null && t2 == null)
			return true;
		
		if((t1 == null && t1 != null) ||  (t1 != null && t1 == null))
			return false;
		
		boolean isRootSame = t1.data.trim().equals(t2.data.trim());
		
		boolean isLeftIdentical = isIdentical(t1.left, t2.left);
		
		boolean isRightIdentical = isIdentical(t1.right, t2.right);
		
		return (isRootSame && isLeftIdentical && isRightIdentical);
		
	}

}
