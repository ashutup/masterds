package com.list;

public class IntersectionOfTwoSortedLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node h1 = new Node();

		h1.appendToTail(1);
		h1.appendToTail(21);
		h1.appendToTail(32);

		h1.appendToTail(44);
		h1.appendToTail(554);
		h1.appendToTail(5555);
		h1.appendToTail(9000);
		
		
		Node h2 = new Node();

		h2.appendToTail(1);
		h2.appendToTail(22);
		h2.appendToTail(32);
		h2.appendToTail(33);

		h2.appendToTail(44);
		h2.appendToTail(55);
		h2.appendToTail(5556);
		h2.appendToTail(6500);
		System.out.println(h1.toStringInt());
		System.out.println(h2.toStringInt());
		
		System.out.println(intersection(h1, h2).toStringInt());
		
	}

	public static Node intersection(Node h1, Node h2) {
		Node res = null;
        Node head = null;
		while (h1 != null && h2 != null) {
		    
			if (h1.data1 < h2.data1) {
				h1 = h1.next;
			} else if (h1.data1 > h2.data1) {
				h2 = h2.next;
			} else {
				Node n = new Node();
				n.data1 = h1.data1;
				if (res == null) {
					res = n;
					head = res;
				} else {
					res.next = n;
					res = res.next;
				}
				h1 = h1.next;
				h2 = h2.next;
			}
		}
		return head;

	}

}
