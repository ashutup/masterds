package com.test.arr;

public class UniqueCharactersInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "a11bcdefghijklmnopqrstuvwxyz";
		
		boolean[] booleanArr = new boolean[256];
		
		for(int i=0 ; i<str.length() ; i++){
			int aciii = str.charAt(i);
			if(booleanArr[aciii]){
				System.out.println("No Unique characters : First duplicate character found " + str.charAt(i));
				System.exit(0);
			}
			booleanArr[aciii] = true;
		}
		System.out.println("ALL Unique characters !!!!");
		
	}

}
