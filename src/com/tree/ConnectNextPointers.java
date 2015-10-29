/*
    Copyright (c) 2015 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.tree;

public class ConnectNextPointers
{

    public static void main (String[] args)
    {
        // TODO Auto-generated method stub
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
        TreeNode root = new TreeNode(20, "", n10, n30);
        
        root.print(root, 0);
        goPreOrder(root);
        
        

    }
    
    public static void goPreOrder(TreeNode root){
        if(root == null)
            return;
        
        connectNext(root);
        
        goPreOrder(root.left);
        goPreOrder(root.right);
        
        traverseForNext(root);
        
    }
    
    
    public static void connectNext(TreeNode root){
        if(root.isLeaf())
            return;
        
        root.left.next = root.right;
        
        if(root.next != null){
            root.right.next = root.next.left;
        }
        
    }
    
    
    public static void traverseForNext(TreeNode root){
        if(root == null)
            return;
        
        traverseForNext(root.left);
        
        System.out.println(root.data1 + "  --> NEXT--> " + (root.next != null ? root.next.data1 : null));
        
        
        traverseForNext(root.right);
        
    }
    
    

}
