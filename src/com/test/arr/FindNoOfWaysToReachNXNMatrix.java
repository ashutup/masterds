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
        
        System.out.println("No of Ways " + noOfPathsWithoutRecursion(10, 10));
        
    }
    
    public static int noOfWaysToReachNxN(int m, int n){
        
        if(m==1 || n == 1){
            return 1;
        }
        
        return noOfWaysToReachNxN(m, n-1) + noOfWaysToReachNxN(m-1, n);
    }
    
    public static int noOfPathsWithoutRecursion(int x, int y) {
		int[][] count = new int[x][y];
		
		for(int i = 0 ; i < x ; i ++){
			count[i][0] = 1;
		}
		
		for(int j = 0 ; j < y ; j ++){
			count[0][j] = 1;
		}
		
		for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				count[i][j] = count[i-1][j] + count[i][j-1];
			}
		}

		return count[x-1][y-1];

	}

}
