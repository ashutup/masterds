package com.tree;

import java.util.Map;
import java.util.TreeMap;

public class DiagonalTraversal {

	public static void main(String[] args) {

		TreeNode root = TreeNode.getBinaryTree();
		root.print(root, 0);

		Map<Integer, TreeNode> map = new TreeMap<>();
		diagonalTraversal(root, 1, map);
		
		for (Integer slopeDistance : map.keySet()) {
			TreeNode temp = map.get(slopeDistance);
			while(temp != null) {
				System.out.print(temp.data1 + " ");
				temp = temp.next;
			}
		}

	}

	public static void diagonalTraversal(TreeNode root, int slopeDistance, Map<Integer, TreeNode> map) {
		if (root == null)
			return;

		if (map.get(slopeDistance) == null) {
			map.put(slopeDistance, root);
		} else {
			TreeNode temp = map.get(slopeDistance);
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = root;
		}

		diagonalTraversal(root.right, slopeDistance, map);
		diagonalTraversal(root.left, slopeDistance + 1, map);

	}

}
