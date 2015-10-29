package com.tree;

/**
 * a-program-to-check-if-a-binary-tree-is-BST-or-not
 * 
 * @author Ashutosh.Sharma
 * 
 */
public class InorderSuccessor {
	
	static TreeNode ios = null;

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

		root.print(root, 0);
		
		System.out.println("Inorder Successor Iterative : " + findInorderSuccessor(root, 28).data1);
		inOrderSuccessor(root, 28);
		System.out.println("Inorder Successor Recursive : " + ios.data1);
		
		
	}
	
	public static void inOrderSuccessor(TreeNode root, int n){
		if(root == null)
			return;
		
		if(n < root.data1){
			ios = root;
			inOrderSuccessor(root.left, n);
		}else{
			inOrderSuccessor(root.right, n);
		}
	}

	public static TreeNode findInorderSuccessor(TreeNode root, int n) {
	    if(root == null)
	        return null;
	    
	    TreeNode suc = null;
	    while(root != null){
	        if(n < root.data1){
	            suc = root;
	            root = root.left;
	        }
	        else if(n >= root.data1){
	            root =root.right;
	        }
	        
	    }
	            
		return suc;

	}
	
	public static int getHeight(TreeNode root){
		if(root == null)
			return 0;
		
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
		
	}
	
	
	public static void levelOrder(TreeNode root){
		int height = getHeight(root);
		for(int i=0 ; i<height ; i++){
			printLevelOrder(root, i);
		}
	}
	
	public static void levelOrder(TreeNode root,boolean ltr){
		int height = getHeight(root);
		for(int i=0 ; i<height ; i++){
			printLevelOrder(root, i,ltr);
			if(ltr)
				ltr = false;
			else
				ltr = true;
		}
	}
	
	public static void printLevelOrder(TreeNode root, int level,boolean ltr){
		if(root == null)
			return;
		if(level == 0){
			System.out.println(root.data1);
			return;
		}
		if(ltr){
			printLevelOrder(root.left, level-1,ltr);
			printLevelOrder(root.right, level-1,ltr);
		}else{
			printLevelOrder(root.right, level-1,ltr);
			printLevelOrder(root.left, level-1,ltr);
		}
	}
	
	
	public static void printLevelOrder(TreeNode root, int level){
		if(root == null)
			return;
		if(level == 0){
			System.out.println(root.data1);
			return;
		}
		
		printLevelOrder(root.left, level-1);
		printLevelOrder(root.right, level-1);
	}

}
