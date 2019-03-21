package com.list;

public class FindMergePointOfTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static String findMergeNode(Node head1, Node head2) {

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

		if (countHead1 > countHead2) {
			while (countHead1 >= 0 && head1 != null) {
				head1 = head1.next;
				countHead1--;
			}
		}

		if (countHead2 > countHead1) {
			while (countHead2 >= 0 && head2 != null) {
				head2 = head2.next;
				countHead2--;
			}
		}

		while (head1 != head2) {
			head1 = head1.next;
			head2 = head2.next;
		}

		return head1.data;

	}

}
