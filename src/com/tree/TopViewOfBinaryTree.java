package com.tree;

import java.util.Map;
import java.util.TreeMap;

public class TopViewOfBinaryTree {

	public static void main(String[] args) {
		
		TreeNode n2 = new TreeNode(2, "", null, null);
		TreeNode n8 = new TreeNode(8, "", null, null);
		TreeNode n50 = new TreeNode(50, "", null, new TreeNode(100, null, null));
		TreeNode n5 = new TreeNode(5, "", n2, n8);

		TreeNode n3 = new TreeNode(3, "", null, null);
		TreeNode n12 = new TreeNode(12, "", n3, null);
		TreeNode n15 = new TreeNode(15, "", n12, null);
		TreeNode n28 = new TreeNode(28, "", null, null);
		TreeNode n25 = new TreeNode(25, "", null, n28);
		TreeNode n40 = new TreeNode(40, "", n50, null);

		TreeNode n10 = new TreeNode(10, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n25, n40);
		TreeNode root = new TreeNode(20, "", n10, n30);
		
		root.print(root, 0);
		
		Map<Integer,TreeNode> map = new TreeMap<Integer,TreeNode>();
		
		gatherTopViewNodes(root, map, 0);
		
		for (TreeNode node : map.values()) {
			System.out.println(node.data1);
		}

	}
	
	private static void gatherTopViewNodes(TreeNode root,Map<Integer,TreeNode> map, int hd ) {
		if(root == null) {
			return;
		}
		
		if(map.get(hd) == null) {
			map.put(hd, root);
		}
		
		gatherTopViewNodes(root.left, map, hd-1);
		gatherTopViewNodes(root.right, map, hd+1);
		
		
	}

}
