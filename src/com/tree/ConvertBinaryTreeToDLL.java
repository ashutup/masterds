/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.tree;

public class ConvertBinaryTreeToDLL
{
    
    static TreeNode prev= null, head= null;

    public static void main (String[] args)
    {
        TreeNode n2 = new TreeNode(2, "", null, null);
        TreeNode n8 = new TreeNode(8, "", null, null);
        TreeNode n50 = new TreeNode(50, "", null, null);
        TreeNode n5 = new TreeNode(5, "", n2, n8);
        TreeNode n12 = new TreeNode(12, "", null, null);
        TreeNode n15 = new TreeNode(15, "", n12, null);
        TreeNode n28 = new TreeNode(28, "", null, null);
        TreeNode n25 = new TreeNode(25, "", null, n28);
        TreeNode n40 = new TreeNode(40, "", null, n50);
        
        

        TreeNode n10 = new TreeNode(10, "", n5, n15);
        TreeNode n30 = new TreeNode(30, "", n25, n40);
        TreeNode root = new TreeNode(20, "", n10, n30);
        
        convert(root);
        
        System.out.println(head.printListVersion());

    }
    
    public static void convert(TreeNode root){
        
        if(root == null){
            return;
        }
        
        convert(root.left);
        
        if(prev == null){
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        
        convert(root.right);
        
        
    }

}
