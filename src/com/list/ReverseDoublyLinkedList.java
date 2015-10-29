package com.list;

public class ReverseDoublyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node = new Node();
		node.doublyAppend(1);
		node.doublyAppend(2);
		node.doublyAppend(3);
		node.doublyAppend(4);
		node.doublyAppend(5);
		
		
		System.out.println(node.printDoublyLinkedList());
		
		reverseDoublylinkedList(node);
	}
	
	
	public static void reverseDoublylinkedList(Node node){
		Node temp = new Node();
		Node current = node;
		
		while(current != null){
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
			System.out.println("   ");
		}
		
		if(temp != null)
			node = temp.prev;
		
		System.out.println(node.printDoublyLinkedList());
	}

}
