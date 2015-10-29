package com.list;

public class KthFromEndOfLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node();
		
		head.appendToTail(12);
		head.appendToTail(112);
		head.appendToTail(1112);
		
		head.appendToTail(21);
		head.appendToTail(43);
		head.appendToTail(65);
		head.appendToTail(7);
		head.appendToTail(777);
		head.appendToTail(876);
		
		System.out.println(head.toStringInt());
		
		findKthFromTheLast(head, 2);

	}
	
	
	public static void findKthFromTheLast(Node head, int k){
		Node runner = head;
		Node current = head;
		
		int i = 1;
		while(i <= k){
			runner = runner.next;
			i++;
		}
		
		while(runner != null){
			runner = runner.next;
			current = current.next;
		}
		System.out.println(k+"th element from the end is " + current.data1);
	}

}
