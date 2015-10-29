package com.list;

public class DetectLoopInLinkedList {

	public static void main(String[] args) {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		
		n1.data = "1";
		n1.next = n2;
		
		n2.data = "2";
		n2.next =n3;
		
		n3.data ="3";
		n3.next = n4;
		
		n4.data ="4";
		n4.next = n5;
		
		n5.data ="5";
		n5.next = n4;
		
		isLoopExists(n1);

	}
	
	public static void isLoopExists(Node head){
		Node slow = head;
		Node fast = head.next.next;
		
		while( fast.next != null){
			if(slow.data.equals(fast.data) ){
				System.out.println("Yes Loop Exists !!!");
				return;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("No !!! Loop Does Not Exists ");
	}

}
