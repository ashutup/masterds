/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.test.arr;

import java.util.ArrayList;
import java.util.List;

public class Utils
{
    public static String stringify(int arr[]) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list.toString();

    }
}
