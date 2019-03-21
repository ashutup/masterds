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
		
		System.out.println("MergedPoint " + findMergeNode(head, head1));
	}

	public static void findIntersectionPoint(Node head, Node head1) {
		int l = head.length();
		int l1 = head1.length();
		int diff = Math.abs(l - l1);
		Node big = null;
		Node small = null;
		if (l > l1) {
			big = head;
			small = head1;
		} else {
			big = head1;
			small = head;
		}

		for (int i = 0; i < diff; i++) {
			big = big.next;
		}

		while (big != small) {
			big = big.next;
			small = small.next;
		}

		System.out.println("Intersection Point " + big.data1 + " "
				+ small.data1);
	}

	static int findMergeNode(Node head1, Node head2) {

		int countHead1 = 0, countHead2 = 0;
		Node temp = head1;
		while (temp != null) {
			countHead1++;
			temp = temp.next;
		}

		temp = head2;
		while (temp != null) {
			countHead2++;
			temp = temp.next;
		}

		int diff = Math.abs(countHead1 - countHead2);
		
		if(countHead1 > countHead2){
			for(int i = 0 ; i < diff ; i++)
				head1 = head1.next;
		}
		else{
			for(int i = 0 ; i < diff ; i++)
				head2 = head2.next;
		}

		while (head1 != head2) {
			head1 = head1.next;
			head2 = head2.next;
		}

		return head1.data1;

	}

}
