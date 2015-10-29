package com.tree;

public class ConvertBinaryTreeToDoublyLinkList {
	
	private static TreeNode prev = null;
	static TreeNode head = null;
	/**
	 * @param args
	 */
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
		
		head  = new TreeNode();
		TreeTraversal.inOrderTraversal(root);
		
		
		convertToDoublyLinkedList(root);
		
		System.out.println(head.printListVersion());
//		System.out.println(head.printListVersion());
		
//		convertToDLL(root);
//		System.out.println(head.printListVersion());
		
	}
	
	
	public static void convertToDLL(TreeNode node){
		if(node == null)
			return ;
		
		convertToDLL(node.left);
		
		if(prev == null){
			head = node;
		}else{
			node.left = prev;
			prev.right = node;
		}
		prev = node;
		convertToDLL(node.right);
	}
	
	
	public static void convertToDoublyLinkedList(TreeNode node){
		// Base case
	    if (node == null) return;
	 
	    // Initialize previously visited node as NULL. This is
	    // static so that the same value is accessible in all recursive
	    // calls
	   
	 
	    // Recursively convert left subtree
	    convertToDoublyLinkedList(node.left);
	 
	    // Now convert this node
	    if (prev == null){
	        head = node;
	    }
	    else
	    {
	        node.left = prev;
	        prev.right = node;
	    }
	    prev = node;
	 
	    // Finally convert right subtree
	    convertToDoublyLinkedList(node.right);
	}

}
