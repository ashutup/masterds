/*
    Copyright (c) 2015 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.test.arr;

import java.util.Stack;

public class ReverseStackElements
{

    public static void main (String[] args)
    {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < 100; i++) {
            st.push(i);
        }
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty())
            return;
        
        int val = st.pop();
        
        reverse(st);
        
        putAtBottom(st, val);
    }
    
    private static void putAtBottom(Stack<Integer> st, int val){
        if(st.isEmpty())
            st.push(val);
        else{
            int temp = st.pop();
            putAtBottom(st, val);
            st.push(temp);
        }
    }

}
