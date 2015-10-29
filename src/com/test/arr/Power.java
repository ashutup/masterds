package com.test.arr;

public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		
		System.out.println(power(2, 9));

	}
	
	
	public static int power(int x,int y){
	    if(y == 0){
	        System.out.println(y + " 1");
	        return 1;
	    }
	    
	    int temp = power(x, y/2);
	    
	    if(y%2 == 0){
	        System.out.println(y + " " + temp*temp);
	        return temp * temp;
	    }
	    else{
	        System.out.println(y + " " + x*temp*temp);
	        return x * temp * temp;
	    }
	}

}
