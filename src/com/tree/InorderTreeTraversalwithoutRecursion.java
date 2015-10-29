package com.tree;

import java.util.Stack;

public class InorderTreeTraversalwithoutRecursion {

	/**
	 * Inorder Tree Traversal without Recursion
	 * 
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

		traverseWithStack(root);
		
		
		
		
	}
	
	
	public static void  traverseWithStack(TreeNode node){
		Stack<TreeNode> s = new Stack<TreeNode>();
		boolean complete = false;
		while(!complete){
			while(node!=null){
				s.push(node);
				node = node.left;
			}
			
			if(!s.isEmpty()){
				TreeNode temp = s.pop();
				System.out.println(temp.data1);
				
				if(temp.right != null){
					node = temp.right;
					continue;
				}
				
			}
			else{
				complete = true;
			}
		}
	}

	

}
