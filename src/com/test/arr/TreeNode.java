package com.test.arr;

public class TreeNode {

	String data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode() {
	}
	
	public TreeNode(String data,TreeNode left,TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	
	public void print(TreeNode node, int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("   ");
        }
        if (node == null) {
            System.out.println("null");
            return;
        }
        System.out.println(node.data);
        if (node.isLeaf()) return;
        print(node.left, indent + 1);
        print(node.right, indent + 1);
    }
	
	public boolean isLeaf() {
        return left == null && right == null;
    }

}
