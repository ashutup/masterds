/*
    Copyright (c) 2015 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.tree;

public class FindMaxInBinaryTree
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
        TreeNode n28 = new TreeNode(1000, "", null, null);
        TreeNode n25 = new TreeNode(25, "", null, n28);
        TreeNode n40 = new TreeNode(40, "", null, n50);

        TreeNode n10 = new TreeNode(10, "", n5, n15);
        TreeNode n30 = new TreeNode(30, "", n25, n40);
        TreeNode root = new TreeNode(20, "", n10, n30);
        
        System.out.println(findMax(root));
    }
    
    
    public static int findMax(TreeNode root){
        if(root == null)
            return Integer.MIN_VALUE;
        
        int max = Integer.MIN_VALUE;
        
        int maxInLeft = findMax(root.left);
        int maxInRight = findMax(root.right);
        
        if(maxInLeft > maxInRight)
            max = maxInLeft;
        else 
            max = maxInRight;
        
        if(root.data1 > max)
            max = root.data1;
        
        return max;
        
    }

}
