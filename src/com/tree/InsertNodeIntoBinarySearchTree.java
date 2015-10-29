/*
    Copyright (c) 2015 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.tree;

public class InsertNodeIntoBinarySearchTree
{

    public static void main (String[] args)
    {
        TreeNode n5 = new TreeNode(5, "", null, null);
        TreeNode n15 = new TreeNode(15, "", null, null);

        TreeNode n25 = new TreeNode(25, "", null, null);
        TreeNode n40 = new TreeNode(40, "", null, null);

        TreeNode n10 = new TreeNode(10, "", n5, n15);
        TreeNode n30 = new TreeNode(30, "", n25, n40);
        TreeNode root = new TreeNode(20, "", n10, n30);

        root.print(root, 0);
        
        root = insert(root, 27);
        
        root.print(root, 0);
    }
    
    public static TreeNode insert(TreeNode root, int n){
        if(root == null){
            TreeNode toInsert = new TreeNode(n, "", null, null);
            
            return toInsert;
        }
        
        if(n < root.data1)
            root.left = insert(root.left, n);
        else if(n > root.data1)
            root.right = insert(root.right, n);
        
        return root;
    }

}
