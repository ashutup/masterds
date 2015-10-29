package com.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     char[] arr = {'a','b','z'};
     int size = 2;
     
     
     printAll(arr, "", size);
	}
	
	private static void printAll(char[] arr,String starting,int size){
		if(size == 0){
			System.out.println(starting);
			starting = "";
			return;
		}
		
		
		for (char c : arr) {
			String newPrefix = starting + c;
			
			printAll(arr, newPrefix, size-1);
		}
		
	}

}
