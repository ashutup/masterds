/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.test.arr;

import com.list.Node;

public class FindNonRepeatingCharacterInStreamInConstantTime
{
    
    public static void main (String[] args)
    {
        String str = "abcdefgabcdfg";
        find(str);
    }

    public static void find(String input){
        
        char[] arr = input.toCharArray();
        
        Node[] inDLL = new Node[256];
        boolean[] isRepeated = new boolean[256];
        
        Node dll = null;
        Node head = null;
        Node tail = null;
        
        for (int i = 0; i < arr.length; i++) {
            if(isRepeated[arr[i]]){
                continue;
            }
            else if (!isRepeated[arr[i]] && inDLL[arr[i]] != null){
                Node node = inDLL[arr[i]];
                
                if(head == tail){
                    head = null;
                    tail = null;
                    continue;
                }
                if(node.prev == null){
                    head = node.next;
                    node.prev = null;
                    node.next = null;
                }else if(node.next == null){
                    node.prev.next = null;
                    tail = node.prev;
                    node.prev = null;
                    node.next = null;
                    
                }else{
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                    node.next = null;
                    node.prev = null;
                }
                
                isRepeated[arr[i]] = true;
                
            }
            else if(!isRepeated[arr[i]] && inDLL[arr[i]] == null){
                Node node = new Node();
                node.data = arr[i]+"";
                
                if(head == null){
                    head = node;
                    tail = node;
                }
                else{
                    tail.next = node;
                    tail = tail.next;
                }
                
                inDLL[arr[i]] = node;
                
            }
        }
        
        
        System.out.println("First Non Repeated Item " + head.data);
        
        
        
    }
}



