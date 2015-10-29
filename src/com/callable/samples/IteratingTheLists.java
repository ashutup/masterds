package com.callable.samples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingTheLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		Iterator it = list.iterator();
		ListIterator lit = list.listIterator();
		
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
	}

}
