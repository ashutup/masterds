package com.list;

import java.util.ArrayList;
import java.util.List;

public class ReverseInGroups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node();

		for (int i = 0; i < 16; i++) {
			head.appendToTail(i);
		}
		System.out.println(head.toStringInt());
//		Node result = reverseInGroup(head,4);
		Node result = reverse(head);
		System.out.println(result.toStringInt());
	}
	
	public static Node reverseInGroup(Node head, int k){
		Node current,prev=null,agla=null;
		
		current = head;
		int cnt = 0;
				
		while(current != null && cnt < k){
			agla = current.next;
			current.next = prev;
			
			prev = current;
			current = agla;
			
			cnt++;
		}
		
		if(current != null)
			head.next = reverseInGroup(current, k);
		
		
		return prev;
	}
	
	

	public static Node reverse(Node headNode) {
		Node current,prev=null,agla=null;
		current = headNode;
		
		while(current != null){
			agla = current.next;
			current.next = prev;
			
			prev = current;
			
			current = agla;
			
		}
		
		return prev;
	}
}
