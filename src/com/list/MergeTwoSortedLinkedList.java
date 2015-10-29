package com.list;

public class MergeTwoSortedLinkedList {

	/**
	 * Given 2 sorted linked list , merge them into single sorted list. Change
	 * the pointers, don't copy data
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Node first = new Node();
		first.appendToTail(1);
		first.appendToTail(3);
		first.appendToTail(5);
		first.appendToTail(7);
		first.appendToTail(9);
		first.appendToTail(11);
		first.appendToTail(13);
		first.appendToTail(15);

		Node second = new Node();
		second.appendToTail(2);
		second.appendToTail(4);
		second.appendToTail(6);
		second.appendToTail(8);
		second.appendToTail(10);
		second.appendToTail(12);
		second.appendToTail(14);
        second.appendToTail(16);


		System.out.println(first.toStringInt());
		System.out.println(second.toStringInt());

		mergeTwoSortedLinkedLists(first, second);
	}

	public static void mergeTwoSortedLinkedLists(Node first, Node second) {
		Node result = new Node();
		Node finalResult = null;
		
		if(first.data1 <= second.data1){
		    finalResult = first;
		    first = first.next;
		}
		else{
		    finalResult = second;
		    second = second.next;
		}
		
		result = finalResult;
		
		
		while(first != null && second != null){
		    if(first.data1 <= second.data1){
		        result.next = first;
		        first = first.next;
		    }
		    else{
		        result.next = second;
		        second = second.next;
		    }
		    result = result.next;
		}
		
		if(first == null)
		    result.next = second;
		
		if(second ==null)
		    result.next = first;
		
		
		

		System.out.println("Merged Sorted List : " + finalResult.toStringInt());
	}

}
