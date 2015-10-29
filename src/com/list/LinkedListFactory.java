package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedListFactory {

	public static void main(String[] args) {

		Node first = new Node();

		for (int i = 0; i < 20; i=i+2) {
			first.appendToTail(i + "");
		}
		
		Node second = new Node();

		for (int i = 1; i < 20; i=i+2) {
			second.appendToTail(i + "");
		}
		
//		System.out.println(first);
//		System.out.println(second);
//		
//		mergeAtAlternatePositions(first, second);
		
		reverse(first);

	}

	/****
	 * Merges the first linked list with second, node from the first list will
	 * come first in resultant list
	 * 
	 * @param first
	 * @param second
	 */
	public static void mergeAtAlternatePositions(Node first, Node second) {
		System.out.println("First : " + first);
		System.out.println("Second : " + second);
		
		Node temp1 = first;
		Node temp2 = second;
		Node result = first;
		while((first!= null && first.next != null) || (second!=null && second.next !=null)){
			temp1=first.next;
			first.next = second;
			
			temp2=second.next;
			
			second.next = temp1;
			
			
			first = temp1;
			second = temp2;
		}
		System.out.println("First : " + first);
		System.out.println("Second : " + second);
		System.out.println("Merged Result : " + result);
	}

	public static Node reverse(Node headNode) {
		System.out.println("Original List :  " + headNode.toString());
		Node currentNode, temp = null;
		Node prevNode = headNode;
		currentNode = prevNode.next;
		prevNode.next = null;
		while (currentNode.next != null) {
			temp = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = temp;
		}
		currentNode.next = prevNode;
		System.out.println("Reversed List :  " + currentNode.toString());
		return currentNode;
	}

	/***
	 * delete all nodes having the given data
	 * 
	 * @param data
	 * @param headNode
	 */
	public static Node deleteNode(String data, Node headNode) {
		System.out.println("Before Deletion : " + headNode);
		if (headNode == null || headNode.next == null) {
			System.out
					.println("Cannot delete as Either list has just one element or list itself is NULL");
		}
		Node currentNode = headNode;
		Node previousNode = headNode;
		
		if(currentNode.data.trim().equals(data)){
			headNode = currentNode.next;
		}

		while (currentNode.next != null) {
			if (currentNode.data.trim().equals(data.trim())) {
				previousNode.next = currentNode.next;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		System.out.println("After Deletion : " + headNode);
		return headNode;
	}

}
