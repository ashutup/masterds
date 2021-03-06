package com.list;

public class ReverseLinkedListUsingRecursion {

	public static Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		head = new Node();

		for (int i = 1; i < 20; i++) {
			head.appendToTail(i);
		}

		System.out.println("Original " + head.toStringInt());

		reverseRecursive(head);

		System.out.println("Reverse : " + head.toStringInt());

	}

	public static void printReverse(Node head) {
		if (head == null)
			return;

		printReverse(head.next);
		System.out.println(head.data1);
	}

	public static void reverseRecursive(Node node) {
		if(node == null || node.next == null){
			head = node;
			return ;
		}
		
		Node first = node;
		Node rest = node.next;
		
		reverseRecursive(rest);
		
		first.next.next = first;
		first.next = null;
	}

}
