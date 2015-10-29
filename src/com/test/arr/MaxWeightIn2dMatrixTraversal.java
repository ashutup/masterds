/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
 */

package com.test.arr;

public class MaxWeightIn2dMatrixTraversal
{

    public static void main (String[] args)
    {
        int[][] mat = { { 8, 2, 4, 5 }, 
                        { 1, 10, 15, 6 }, 
                        { 2, 11, 30, 7 },
                       { 9, 3, 7, 2 } };
        
        System.out.println(maxWeight(mat, 3, 3));
        maxWeightMemoization(mat);
    }
    
    public static void maxWeightMemoization(int[][] mat){
        int[][] res = new int[mat.length][mat[0].length];
        
        for(int i=1 ; i < mat[0].length ; i++){
            res[0][i] = mat[0][i-1] + mat[0][i];
        }
        
        for(int j=1 ; j < mat.length ; j++){
            res[j][0] = mat[j-1][0] + mat[j][0];
        }
        
        for (int i = 1; i < res.length; i++) {
            for (int j = 1; j < res.length; j++) {
                
                res[i][j] = mat[i][j] + Math.max(res[i][j-1], res[j-1][i]);
                    
            }
            
        }
        
        System.out.println(res[3][3]);
    }
    
    
    public static int  maxWeight(int[][] mat, int i , int j){
        if(i < 0 || j < 0)
            return 0;
        
        if(i == 0 && j == 0){
            return mat[i][j];
        }
        
        int max = Math.max(maxWeight(mat, i-1, j), maxWeight(mat, i, j-1));
        
        return mat[i][j] + max;
    }

}
