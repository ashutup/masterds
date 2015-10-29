package com.list;

public class IdenticalList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node first = new Node();

		for (int i = 0; i < 9; i++) {
			first.appendToTail(i + "");
		}

		Node second = new Node();

		for (int i = 0; i < 9; i++) {
			second.appendToTail(i + "");
		}

		System.out.println("Is Identical : " + areIdenticalRecursive(first, second));
	}

	public static boolean areIdentical(Node first, Node second) {
		System.out.println("First : " + first);
		System.out.println("Second : " + second);
		while (true) {
			if (null == first && null == second) {
				return true;
			}
			if (null == first && null != second) {
				return false;
			}
			if (null != first && null == second) {
				return false;
			}
			if (!first.data.equals(second.data) ) {
				return false;
			}
			first = first.next;
			second = second.next;
		}
	}
	
	
	public static boolean areIdenticalRecursive(Node first, Node second) {
		System.out.println("First : " + first);
		System.out.println("Second : " + second);
			if (null == first && null == second) {
				return true;
			}
			if (null == first && null != second) {
				return false;
			}
			if (null != first && null == second) {
				return false;
			}
			if (!first.data.equals(second.data) ) {
				return false;
			}
			return areIdentical(first.next, second.next);
	}
	
	

}
