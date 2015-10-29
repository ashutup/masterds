package com.list;

public class MergeTwoSortedLinkedListRecursion {

	/**
	 * USING RECURSION
	 * Given 2 sorted linked list , merge them into single sorted list. Change
	 * the pointers, don't copy data
	 * @param args
	 */
	public static void main(String[] args) {
		Node first = new Node();
		first.appendToTail(5);
		first.appendToTail(7);
		first.appendToTail(8);
		first.appendToTail(9);
		first.appendToTail(15);
		first.appendToTail(20);
		first.appendToTail(100);

		Node second = new Node();
		second.appendToTail(5);
		second.appendToTail(7);
		second.appendToTail(8);
		second.appendToTail(9);
		second.appendToTail(11);

		System.out.println(first.toStringInt());
		System.out.println(second.toStringInt());

		
		System.out.println("Merged : " + mergeTwoSortedLinkedLists(first, second).toStringInt());
	}
	
	public static Node mergeTwoSortedLinkedLists(Node first, Node second){
		Node result = null;
		//base case
		if(first == null)
			return second;
		if(second == null)
			return first;
		
		if(first.data1 <= second.data1){
			result = first;
			result.next = mergeTwoSortedLinkedLists(first.next, second);
		}
		else{
			result = second;
			result.next = mergeTwoSortedLinkedLists(first, second.next);
		}
		return result;
	}

}
