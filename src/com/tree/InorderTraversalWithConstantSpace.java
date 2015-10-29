/*
    Copyright (c) 2015 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.tree;

public class InorderTraversalWithConstantSpace
{

    public static void main (String[] args)
    {
        TreeNode n100 = new TreeNode(100, "", null, null);
        TreeNode n200 = new TreeNode(200, "", null, null);
        TreeNode n300 = new TreeNode(300, "", null, null);
        TreeNode n2 = new TreeNode(2, "", null, null);
        TreeNode n8 = new TreeNode(8, "", null, null);
        TreeNode n50 = new TreeNode(50, "", null, null);
        TreeNode n5 = new TreeNode(5, "", n2, n8);
        TreeNode n12 = new TreeNode(12, "", null, null);
        TreeNode n15 = new TreeNode(15, "", n12, n100);
        TreeNode n28 = new TreeNode(28, "", null, null);
        TreeNode n25 = new TreeNode(25, "", n200, n28);
        TreeNode n40 = new TreeNode(40, "", n300, n50);
        
       
        
        

        TreeNode n10 = new TreeNode(10, "", n5, n15);
        TreeNode n30 = new TreeNode(30, "", n25, n40);
        TreeNode root = new TreeNode(20, "", n10, n30,null);
        
        n10.parent=root;
        n30.parent=root;
        
        n5.parent =n10;
        n15.parent=n10;
        
        n25.parent =n30;
        n40.parent=n30;
        
        n2.parent =n5;
        n8.parent=n5;
        
        n12.parent=n15;
        n100.parent=n15;
        
        n200.parent=n25;
        n28.parent=n25;
        
        n300.parent=n40;
        n50.parent=n40;
        
        
        
        root.print(root, 0);
        
        traverse(root);
    }
    
    
    public static void traverse(TreeNode root){
        
        TreeNode prev=null,curr=null,next=null;
        curr = root;
        
        while(curr != null){
            
            if(prev == null || prev.left == curr || prev.right == curr){
                if(curr.left != null){
                    next = curr.left;
                }
                else{
                    System.out.println(curr.data1);
                    next = curr.right != null ? curr.right : curr.parent;
                }
            }
            else if(curr.left == prev){
                System.out.println(curr.data1);
                next = curr.right != null ? curr.right : curr.parent;
            }
            else{
                next = curr.parent;
            }
            
            prev = curr;
            curr = next;
        }
        
    }

}
