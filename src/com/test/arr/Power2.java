/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.test.arr;

public class Power2
{

    public static void main (String[] args)
    {
        // TODO Auto-generated method stub
        
        System.out.println(compute(2, 10));

    }
    
    
    public static int compute(int x,int y){
        if(y == 0)
            return 1;
        
        int result = compute(x,y/2);
        
        if(y % 2 == 0)
            return result * result;
        else
        
        
        return x * result * result;
        
    }

}
