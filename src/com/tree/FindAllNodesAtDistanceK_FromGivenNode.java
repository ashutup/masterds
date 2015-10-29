package com.tree;

public class FindAllNodesAtDistanceK_FromGivenNode {

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
		
		printNodesAtDistanceK(root, 1, 50);
		

	}
	
	public static void printNodesDown(TreeNode root, int k){
		if(root == null)
			return ;
		
		if(k == 0)
			System.out.println(root.data1);
		
		printNodesDown(root.left, k-1);
		printNodesDown(root.right, k-1);
	}
	
	public static int printNodesAtDistanceK(TreeNode root, int k, int key){
		if(root == null)
			return -1;
		
		if(root.data1 == key){
			printNodesDown(root, k);
			return 0;
		}
		
		int dl = printNodesAtDistanceK(root.left, k, key);
		if(dl != -1){
			if(dl + 1 == k){
				System.out.println(root.data1);
			}
			else{
				printNodesDown(root.right, k-dl-2);
			}
			return 1+dl;	
		}
		
		int dr = printNodesAtDistanceK(root.right, k, key);
		if(dr != -1){
			if(dr + 1 == k){
				System.out.println(root.data1);
			}
			else{
				printNodesDown(root.left, k-dr-2);
			}
			return 1+dr;	
		}
		
		return -1;
	}

}
