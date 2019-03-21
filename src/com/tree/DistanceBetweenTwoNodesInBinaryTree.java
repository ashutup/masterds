package com.tree;


public class DistanceBetweenTwoNodesInBinaryTree {

	public static void main(String[] args) {

		TreeNode root = TreeNode.getBinaryTree();

		root.print(root, 0);
		System.out.println("Distance : " + findDist(root, 2, 3));
	}

	static int findDist(TreeNode root, int a, int b) {
		if (root == null) {
			return -1;
		}
		TreeNode lca = findLCA(root, a, b);
		System.out.println("LCA " + lca.data1);
		int distance1 = findDistance(lca, a, 0);
		int distance2 = findDistance(lca, b, 0);

		return distance1 + distance2;
	}

	static int findDistance(TreeNode root, int key, int count) {
		if (root == null) {
			return -1;
		}
		if (root.data1 == key) {
			return count;
		}
		count++;
		int fromLeft = findDistance(root.left, key, count);
		if (fromLeft != -1) {
			return fromLeft;
		}

		return findDistance(root.right, key, count);
	}

	static TreeNode findLCA(TreeNode root, int a, int b) {
		if (root == null) {
			return null;
		}

		if (root.data1 == a || root.data1 == b) {
			return root;
		}

		TreeNode leftLCA = findLCA(root.left, a, b);
		TreeNode rightLCA = findLCA(root.right, a, b);
		
		if(leftLCA != null && rightLCA != null){
			return root;
		}

		if (leftLCA != null) {
			return leftLCA;
		}
		return rightLCA;
	}

}
