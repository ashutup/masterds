package com.tree;

public class KDistanceFromLeaf {

	/**
	 * Print all nodes that are at distance k from a leaf node
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
		TreeNode T = new TreeNode(50, "", n20, n30);

		T.print(T, 0);
		System.out.println("--------------");
		printNodes(T, 2);
	}
	
	
	public static void printNodes(TreeNode root,int k){
		int[] dataPath = new int[20];
		boolean[] visited = new boolean[20];
		
		printUtil(root, dataPath, visited, 0, k);
		
	}
	
	public static void printUtil(TreeNode node,int[] dataPath,boolean[] visited,int pathLen, int k){
		if(node == null)
			return;
		
		dataPath[pathLen] = node.data1;
		visited[pathLen] = false;
		pathLen++;
		
		if(node.left == null && node.right == null && pathLen-k-1 >=0 && visited[pathLen - k - 1] == false){
			System.out.println(dataPath[pathLen - k -1]);
			visited[pathLen - k - 1] = true;
			
			return;
		}
		printUtil(node.left, dataPath, visited, pathLen, k);
		printUtil(node.right, dataPath, visited, pathLen, k);
	}

}
