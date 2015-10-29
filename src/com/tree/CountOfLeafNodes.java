package com.tree;

public class CountOfLeafNodes {
    
    private static int count=0;

	public static void main(String[] args) {
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
        
        root.print(root, 0);
		getLeafNodesCount(root);
		System.out.println("Count of leaf nodes : " + count);
		
		System.out.println(getLeafNodesCount1(root));
	}
	
	public static void getLeafNodesCount(TreeNode node){
		if(node == null){
			return ;
		}
		
		if(node.isLeaf()){
			count++;
			return;
			
		}
		getLeafNodesCount(node.left) ;
		getLeafNodesCount(node.right);
		
		
	}
	
	private static int getLeafNodesCount1(TreeNode root){
	    if(root == null)
	        return 0;
	    
	    if(root.isLeaf())
	        return 1;
	    
	    return getLeafNodesCount1(root.left) + getLeafNodesCount1(root.right);
	}

}
