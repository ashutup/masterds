package com.list;

import java.util.Stack;

public class DetectIfLinkedListIsPalindrome {
	
	static Node one;

	public static void main(String[] args) {
		Node head = new Node();
		String str = "DALAD";
		char[] charArr = str.toCharArray();

		for (char c : charArr) {
			head.appendToTail(c + "");
		}
		// for (int i = 0; i <11; i++) {
		// head.appendToTail(i + "");
		// }
		one = head;

		System.out.println(isPalindromeRecursive(head));
	}
	
	public static boolean isPalindromeRecursive(Node head){
		if(head == null)
			return true;
		
		boolean res = isPalindromeRecursive(head.next);
		
		if(!res)
			return false;
		
		if(res && one.data.equals(head.data)){
			one = one.next;
			return true;
		}
		
		
//		one = one.next;
		
		return false;
	}

	public static void isPalindrome(Node head) {
		Stack<String> stack = new Stack<String>();
		Node slow = head;
		Node fast = head;
		stack.push(slow.data);
		while (true) {
			slow = slow.next;
			fast = fast.next.next;
			stack.push(slow.data);

			// even count of number
			if (fast == null) {
				stack.pop();
				break;
			}

			// odd count of number
			if (fast.next == null) {
				stack.pop();
				slow = slow.next;
				break;
			}
		}
		boolean isPalindrome = false;
		int i = 0;
		System.out.println(stack);
		while (!stack.isEmpty()) {
			if (stack.pop().equals(slow.data)) {
				isPalindrome = true;
				i++;
				slow = slow.next;
			} else {
				isPalindrome = false;
				break;
			}
		}
        System.out.println("No. of Comparisons : " + i);
		System.out.println("Is Palindrome : " + isPalindrome);

	}

}
