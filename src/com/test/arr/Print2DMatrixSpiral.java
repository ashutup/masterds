/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.test.arr;

public class Print2DMatrixSpiral
{

    public static void main (String[] args)
    {
        // TODO Auto-generated method stub
        int a[][] = {   {1,  2,  3,  4,  5,  6},
                        {7,  8,  9,  10, 11, 12},
                        {13, 14, 15, 16, 17, 18},
                        {19, 20, 21, 22, 23, 24},
                        {25, 26, 27, 28, 29, 30}
                    };
        
        printSpiral(a);
                 

    }
    
    
    public static void printSpiral(int[][] arr){
        int rowS = 0;
        int rowE = arr.length -1;
        int colS = 0;
        int colE = arr[0].length -1;
        
        int i;
        
        while(rowS <= rowE && colS <= colE){
            
            for (i = colS; i <= colE; i++) {
                System.out.println(arr[rowS][i]);
            }
            rowS++;
            
            for(i = rowS ; i <= rowE ; i++){
                System.out.println(arr[i][colE]);
            }
            colE--;
            
            if(rowS <= rowE ){
                for (i = colE; i >= colS; i--) {
                    System.out.println(arr[rowE][i]);
                }
                rowE--;
            }
            
            if(colS <= colE){
                for (i = rowE;  i >= rowS; i--) {
                    System.out.println(arr[i][colS]);
                }
                colS++;
            }
            
        }
        
    }

}
