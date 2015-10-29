package com.test.arr;

public class MoveAllZeroesToEndOfArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 0,11,12,13,10,0,10,10,0,0,10,100,0,25,25,10,10,3,2 };
		 System.out.println(Utils.stringify(arr)); 
		pushZerosToEnd(arr);
	}
	
	public static void pushZerosToEnd(int arr[])
	{
	    int count  = 0;
	    
	    for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
	    
	    for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
	    
	    System.out.println(Utils.stringify(arr));
	    
	}

}
