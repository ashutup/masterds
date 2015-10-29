package com.test;

public class SubProperty extends Property implements IGet, IGetSet {

	public static void main(String[] args) {
		IGetSet writer = new SubProperty();
		
		
		
		IGet reader = new SubProperty();
		
	}
	
	
}
