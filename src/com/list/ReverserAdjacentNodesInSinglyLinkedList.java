package com.list;

public class ReverserAdjacentNodesInSinglyLinkedList {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node();

		for (int i = 1; i < 11; i++) {
			head.appendToTail(i);
		}

//		reverse(head);

		reverseRecursive(head);
		System.out.println(head.toStringInt());
	}

	public static void reverse(Node node) {
		Node current = node;
		int data = 0;
		while (current != null && current.next != null) {
			data = current.data1;
			current.data1 = current.next.data1;
			current.next.data1 = data;
			current = current.next.next;
		}
		System.out.println(node.toStringInt());
	}

	public static void reverseRecursive(Node node) {
		if (node != null && node.next != null) {

			int data = 0;

			data = node.data1;
			node.data1 = node.next.data1;
			node.next.data1 = data;

			reverseRecursive(node.next.next);

		}
	}

}
