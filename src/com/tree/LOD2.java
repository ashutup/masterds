/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.tree;

public class LOD2
{

    public static void main (String[] args)
    {
        TreeNode n5 = new TreeNode(5, "", null, null);
        TreeNode n15 = new TreeNode(15, "", null, null);

        TreeNode n21 = new TreeNode(21, "", null, null);
        TreeNode n9 = new TreeNode(9, "", null, null);

        n9.left = new TreeNode(8, "", null, null);
        n9.right = new TreeNode(100, "", null, null);

        TreeNode n20 = new TreeNode(20, "", n5, n15);
        TreeNode n30 = new TreeNode(30, "", n21, n9);
        TreeNode root = new TreeNode(50, "", n20, n30);
        
        
        root.print(root, 0);
        
        
        int h = height(root);
        for(int i=1 ; i <= h ; i++){
            traverse(root, i);
        }
    }
    
    public static void traverse(TreeNode node, int level){
        if(node == null)
            return;
        
        if(level == 1){
            System.out.println(node.data1);
        }
        
        traverse(node.left, level-1);
        traverse(node.right, level-1);
        
    }
    
    public static int height(TreeNode node){
        if(node == null)
            return 0;
        
        return Math.max(height(node.left), height(node.right)) + 1;
        
    }

}
