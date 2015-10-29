/*
x    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.tree;

public class ConnectNodesAtSameLevelWithNextPointers
{
    
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
        
        root.print(root, 0);
        connect(root, false);
        
        traverseForNext(root);
        
        
    }
    
    public static void traverseForNext(TreeNode root){
        if(root == null)
            return;
        
        traverseForNext(root.left);
        
        System.out.println(root.data1 + "  --> NEXT--> " + (root.next != null ? root.next.data1 : null));
        
        
        traverseForNext(root.right);
        
    }
    
    
    
    public static void connect(TreeNode root, boolean connectAcrossLevels){
        
        root.next = null;
        
        while(root != null){
            
            TreeNode p = root;
            
            TreeNode levelLastNode = null;
            
            while(p != null){
                if(p.left != null){
                    if(p.right != null)
                        p.left.next = p.right;
                    else
                        p.left.next = getNextRight(p);
                }
                
                if(p.right != null){
                    p.right.next = getNextRight(p);
                }
                
                if(p.next == null){
                    levelLastNode = p;
                }
                p = p.next;
                
            }
            
            if(root.left != null)
                root = root.left;
            else if (root.right != null)
                root = root.right;
            else
                root = getNextRight(root);
            
            if(connectAcrossLevels)
            levelLastNode.next = root;
        }
        
    }
    
    
    
    public static TreeNode getNextRight(TreeNode node){
        if(node == null)
            return null;
        
        TreeNode temp = node.next;
        
        while(temp != null){
            if(temp.left != null)
                return temp.left;
            if(temp.right != null)
                return temp.right;
            
            temp = temp.next;
            
        }
        
        return null;
        
    }

}
