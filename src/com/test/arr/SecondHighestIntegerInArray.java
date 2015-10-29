/*
    Copyright (c) 2015 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
 */

package com.test.arr;

public class SecondHighestIntegerInArray
{

    // public static void main (String[] args)
    // {
    //
    // int[] arr = {101,13,56,33,102,12,67,89,68,88,100};
    //
    // int highest = arr[0];
    // int secondHighest = -1;
    //
    // for(int i = 1 ; i < arr.length ; i++)
    // {
    // if(arr[i] > highest){
    // secondHighest = highest;
    // highest = arr[i];
    // }else if(arr[i] > secondHighest){
    // secondHighest = arr[i];
    // }
    // }
    //
    // System.out.println("Second Highest Element : " + secondHighest);
    // }

    public static void main (String[] args)
    {

        int[] arr = new int[] { 13, 56, 33, 12, 67, 89 , 88};
        int max_one = arr[0];
        int max_two = 0;

        for (int i = 1; i < arr.length; i++) {

            if (max_one < arr[i]) {
                max_two = max_one;
                max_one = arr[i];

            }
            else if (max_two > arr[i]) {

                max_two = arr[i];
            }

        }
        System.out.println("Highest is" + max_two);
    }

}
