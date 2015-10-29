/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
 */

public class Palindrome
{

    public static void main (String[] args)
    {
        // TODO Auto-generated method stub
        
        String str = "abc";
        
        for ( int i=0; i<str.length(); i++)
        {
            

            if (str.charAt(i) == str.charAt(i-1))
            {
                if(str.charAt(i-1) == str.charAt(i-2))
                {
                  System.out.println("String is palendriom");   
                }
            }
        }

    }

}
