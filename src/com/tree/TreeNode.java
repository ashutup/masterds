package com.tree;

public class TreeNode {

	String data;
	int data1;
	TreeNode left;
	TreeNode right;
	TreeNode random;
	TreeNode parent;

	TreeNode next;

	public TreeNode() {
	}

	public TreeNode(int data1) {
		this.data1 = data1;
	}

	public TreeNode(String data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public TreeNode(int data1, String data, TreeNode left, TreeNode right) {
		this.data = data;
		this.data1 = data1;
		this.left = left;
		this.right = right;
	}

	public TreeNode(int data1, String data, TreeNode left, TreeNode right,
			TreeNode parent) {
		this.data = data;
		this.data1 = data1;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}

	public TreeNode(int data1, TreeNode left, TreeNode right) {
		this.data1 = data1;
		this.left = left;
		this.right = right;
	}

	public TreeNode(int data1, TreeNode left, TreeNode right, TreeNode parent) {
		this.data1 = data1;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}

	public void print(TreeNode node, int indent) {
		// for (int i = 0; i < indent; i++) {
		// System.out.print("   ");
		// }
		// if (node == null) {
		// System.out.println("null");
		// return;
		// }
		// System.out.println(node.data1);
		// if (node.isLeaf())
		// return;
		// print(node.left, indent + 1);
		// print(node.right, indent + 1);

		BTreePrinter.printNode(node);
	}

	public void printWithRandomPointers(TreeNode node, int indent) {
		for (int i = 0; i < indent; i++) {
			System.out.print("   ");
		}
		if (node == null) {
			System.out.println("null");
			return;
		}
		System.out.println(node.data1 + " | "
				+ (node.random != null ? node.random.data1 : null));
		if (node.isLeaf())
			return;
		print(node.left, indent + 1);
		print(node.right, indent + 1);
	}

	public boolean isLeaf() {
		return left == null && right == null;
	}

	@Override
	public String toString() {
		return data1 + "";
	}

	public String printListVersion() {
		StringBuffer buf = new StringBuffer();
		TreeNode node = this;

		while (node.right != null) {
			buf.append(node.data1 + " -> ");
			node = node.right;
		}
		buf.append(node.data1 + " -> ");
		buf.append(" REVERSE -> ");
		while (node.left != null) {
			buf.append(node.data1 + " -> ");
			node = node.left;
		}
		buf.append(node.data1 + " -> ");
		buf.append("NULL");
		return buf.toString();
	}

	public String print() {
		StringBuffer buf = new StringBuffer();
		TreeNode node = this;

		while (node.right != null) {
			buf.append(node.data + " -> ");
			node = node.right;
		}
		buf.append(node.data + " -> ");
		buf.append("NULL");
		return buf.toString();
	}

	public void printParentsForEachNode(TreeNode root) {

		if (root == null)
			return;

		printParentsForEachNode(root.left);
		System.out.println(root.data1 + " ---> "
				+ (root.parent != null ? root.parent.data1 : null));

		printParentsForEachNode(root.right);
	}

	public static TreeNode getBinaryTree() {
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

		return root;
	}

	public static TreeNode getBST() {
		TreeNode n5 = new TreeNode(5, "", null, null);
		TreeNode n15 = new TreeNode(15, "", null, null);

		TreeNode n25 = new TreeNode(25, "", null, null);
		TreeNode n40 = new TreeNode(40, "", null, null);

		TreeNode n10 = new TreeNode(10, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n25, n40);
		TreeNode root = new TreeNode(20, "", n10, n30);

		return root;

	}

}
