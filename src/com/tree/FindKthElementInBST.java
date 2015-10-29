/*
    Copyright (c) 2015 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.tree;

public class FindKthElementInBST
{
    
    private static int count = 0;
    private static int cnt = 0;
    
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
        
        findKthSmallest(root, 4);
        findKthLargest(root, 2);
        
    }
    
    public static void findKthSmallest(TreeNode root, int k){
        if(root == null){
            return ;
        }
        
        findKthSmallest(root.left, k);
        count++;
        
        if(count == k){
            System.out.println(k+"th smallest : " + root.data1);
            return;
        }
        
        findKthSmallest(root.right, k);
        
        
        
    }
    
    public static void findKthLargest(TreeNode root, int k){
        if(root == null){
            return ;
        }
        
        findKthLargest(root.right, k);
        cnt++;
        
        if(cnt == k){
            System.out.println(k+"th Largest : " + root.data1);
            return;
        }
        
        findKthLargest(root.left, k);
        
        
        
    }

}
