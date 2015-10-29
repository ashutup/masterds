package com.list;

public class SegregateEvenOddNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node();

		head.appendToTail(1);
		head.appendToTail(21);
		head.appendToTail(32);

		head.appendToTail(44);
		head.appendToTail(555);
		head.appendToTail(5556);
		head.appendToTail(65);
		head.appendToTail(889);
		head.appendToTail(98);
		head.appendToTail(10);

		System.out.println(head.toStringInt());
		Node res = segregate(head);
		System.out.println(res.toStringInt());
		
	}

	public static Node segregate(Node head) {
		Node newEnd = null;
		Node start = head;
		Node end = null;
		Node prev = null;
		Node agla = null;
		
		while (head.next != null) {
			head = head.next;
			
		}
		end = head;
		newEnd = end;
		
		while (isOdd(start.data1) && start != end) {
			agla = start.next;
			start.next = null;
			newEnd.next = start;
			newEnd = newEnd.next;
			start = agla;
		}
		head = start;
		prev = head;
		start = start.next;

		while (start != end) {
			if (isOdd(start.data1)) {
				prev.next = start.next;
				start.next = null;
				newEnd.next = start;
				newEnd = newEnd.next;
				start = prev.next;
			} else {
				prev = start;
				start = start.next;
			}
		}
		return head;
	}

	public static boolean isOdd(int data) {
		if (data % 2 != 0)
			return true;
		return false;
	}

}
