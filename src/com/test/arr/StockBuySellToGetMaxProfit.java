/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.test.arr;

public class StockBuySellToGetMaxProfit
{

    public static void main (String[] args)
    {
        int price[] = {10,100,3,2,1,5,80,70,35,450};
        int noOfDays = price.length;
        
        analyze(price, noOfDays);
    }
    
    
    public static void analyze(int[] price, int n){
        int i=0;
        
        while(i < n-1){
            
            while(i< n-1 && price[i+1] <= price[i] ){
                i++;
            }
            
            if(i == n-1)
                break;
            
            int buy = i;
            
            i++;
            
            while( i < n && price[i-1] < price[i] )
                i++;
            
            int sell = i-1;
            
            System.out.println("buy at " +  price[buy] + " and sell at " + price[sell]);
            
        }
    }

}
