package com.callable.samples;

public class MoveCharPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
					String str = "Hello";
					
					char[] arr = str.toCharArray();
					
					char last = arr[arr.length - 1];
					
					for(int i=arr.length-1;i>0;i--){
						arr[i] = arr[i-1];
					}
					arr[0] = last;
					
					for (char c : arr) {
						System.out.println(c);
					}
	}

}
