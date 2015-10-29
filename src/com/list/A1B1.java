package com.list;

/***
 * - Given a linked list like a1-a2-a3-a4-b1-b2-b3-b4. Convert it into
 * a1-b1-a2-b2-a3-b3-a4-b4
 * 
 * @author Ashutosh.Sharma
 * 
 */
public class A1B1 {

	public static void main(String[] args) {
		Node head = new Node();

		for (int i = 1; i < 5; i++) {
			head.appendToTail("a" + i);
		}

		for (int i = 1; i < 5; i++) {
			head.appendToTail("b" + i);
		}
		System.out.println(head.toString());

		a1b1(head);

	}

	public static void a1b1(Node head) {
		Node first = head;
		Node temp = head.next;
		Node search = head.next;
		while (search != null && search.next != null) {
			while (!search.next.data.startsWith("b")) {
				search = search.next;
			}
			// adjusting pointers for shuffling
			head.next = search.next;
			search.next = search.next.next;
			head.next.next = temp;

			// adjusting pointers for next loop
			head = temp;
			temp = head.next;
			search = head.next;
		}

		System.out.println(first.toString());

	}

}
