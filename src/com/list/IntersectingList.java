package com.list;

public class IntersectingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node();

		for (int i = 0; i < 16; i++) {
			head.appendToTail(i);
		}
		
		Node head1 = new Node();

		for (int i = 100; i < 111; i++) {
			head1.appendToTail(i);
		}
		
		head.appendToTail(head1.next.next.next.next);
		
		System.out.println(head.toStringInt());
		System.out.println(head1.toStringInt());
		
		findIntersectionPoint(head, head1);
	}
	
	
	public static  void findIntersectionPoint(Node head, Node head1){
		int l = head.length();
		int l1 = head1.length();
		int diff = Math.abs(l-l1);
		Node big = null;
		Node small = null;
		if(l > l1){
			big = head;
			small = head1;
		}
		else{
			big = head1;
			small = head;
		}
		
		for(int i = 0 ;  i < diff ; i++){
			big = big.next;
		}
		
		while(big != small){
			big = big.next;
			small = small.next;
		}
		
		System.out.println("Intersection Point " + big.data1 + " " + small.data1);
	}

}
