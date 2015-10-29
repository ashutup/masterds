package com.tree;

public class CloneTreeWithAdditionalRandomPointer
{

    public static void main (String[] args)
    {

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
        
        root.random = n30;

        root.printWithRandomPointers(root, 0);
        
        
        TreeNode clonedRoot = cloneLeftRightNode(root);
        copyRandomPointers(root, clonedRoot);
        restorePointers(root, clonedRoot);
        
        clonedRoot.printWithRandomPointers(clonedRoot, 0);
        

    }
    
    public static void restorePointers(TreeNode root, TreeNode clonedRoot){
        if(root == null)
            return;
        
        if(clonedRoot.left != null){
            TreeNode cloneLeft = clonedRoot.left.left;
            root.left = root.left.left;
            clonedRoot.left = cloneLeft;
        }else{
            root.left = null;
        }
        
        restorePointers(root.left, clonedRoot.left);
        restorePointers(root.right, clonedRoot.right);
        
    }
    
    public static void copyRandomPointers(TreeNode root, TreeNode clonedRoot){
        if(root == null)
            return;
        
        if(root.random != null){
            clonedRoot.random = root.random.left;
        }else{
            clonedRoot.random = null;
        }
        
        
        if(root.left != null && clonedRoot.left != null)
            copyRandomPointers(root.left.left, clonedRoot.left.left);
        
        copyRandomPointers(root.right, clonedRoot.right);
    }

    public static TreeNode cloneLeftRightNode (TreeNode root)
    {
        if (root == null)
            return null;

        TreeNode leftChild = root.left;

        root.left = new TreeNode(root.data1);
        
        root.left.left = leftChild;
        
        if(leftChild != null)
            leftChild.left = cloneLeftRightNode(leftChild);
        
        root.left.right = cloneLeftRightNode(root.right);

        return root.left;

    }

}
