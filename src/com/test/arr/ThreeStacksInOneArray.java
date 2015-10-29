/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.test.arr;

import java.util.Stack;

public class ThreeStacksInOneArray
{
    
   

    public static void main (String[] args)
    {
        for (int i = 0; i < 12; i++) {
            push1(i);
            push2(i);
            push3(i);
        }
        
        for (int i = 0; i < 12; i++) {
            pop1();
            pop2();
            pop3();
        }
        
        for (int i = 0; i < 12; i++) {
            push1(i);
            push2(i);
            push3(i);
        }
    }
    
    private static Stack<Integer> freeList = new Stack<Integer>();
    private static StackNode[] arr = new StackNode[10];
    
    static{
        for (int i = 0; i < 10; i++) {
            freeList.push(i);
        }
    }
    
    private static int top1 = -1;
    private static int top2 = -1;
    private static int top3 = -1;
    
    
    public static void push1(Integer i){
        if(freeList.isEmpty())
        {
            System.out.println("STACK FULL");
            return;
        }
        StackNode node = new StackNode();
        node.value = i;
        node.prev = top1;
        
        int index = freeList.pop();
        arr[index] = node;
        top1 = index;
        System.out.println(i + " pushed to stack 1");
    }
    
    public static void push2(Integer i){
        if(freeList.isEmpty())
        {
            System.out.println("STACK FULL");
            return;
        }
        StackNode node = new StackNode();
        node.value = i;
        node.prev = top2;
        
        int index = freeList.pop();
        arr[index] = node;
        top2 = index;
        System.out.println(i + " pushed to stack 2");
    }
    
    public static void push3(Integer i){
        if(freeList.isEmpty())
        {
            System.out.println("STACK FULL");
            return;
        }
        StackNode node = new StackNode();
        node.value = i;
        node.prev = top3;
        
        int index = freeList.pop();
        arr[index] = node;
        top3 = index;
        System.out.println(i + " pushed to stack 3");
    }
    
    public static Integer pop1(){
        if(top1 == -1)
        {
            System.out.println("STACK EMPTY !!!");
            return -1111111;
        }
        StackNode node = arr[top1];
        freeList.add(top1);
        top1 = node.prev;
        System.out.println(node.value + " Popped !!!");
        
        return node.value;
    }
    
    public static Integer pop2(){
        if(top2 == -1)
        {
            System.out.println("STACK EMPTY !!!");
            return -1111111;
        }
        StackNode node = arr[top2];
        freeList.add(top2);
        top2 = node.prev;
        System.out.println(node.value + " Popped !!!");
        return node.value;
    }
    
    public static Integer pop3(){
        if(top3 == -1)
        {
            System.out.println("STACK EMPTY !!!");
            return -1111111;
        }
        StackNode node = arr[top3];
        freeList.add(top3);
        top3 = node.prev;
        System.out.println(node.value + " Popped !!!");
        return node.value;
    }

}
