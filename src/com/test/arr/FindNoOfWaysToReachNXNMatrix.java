/*
    Copyright (c) 2015 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.test.arr;

public class FindNoOfWaysToReachNXNMatrix
{

    public static void main (String[] args)
    {
        
        int[][] mat = {
                       {1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}
        };
        
        System.out.println("No of Ways " + noOfWaysToReachNxN(10, 10));
        
    }
    
    public static int noOfWaysToReachNxN(int m, int n){
        
        if(m==1 || n == 1){
            return 1;
        }
        
        return noOfWaysToReachNxN(m, n-1) + noOfWaysToReachNxN(m-1, n);
    }

}
