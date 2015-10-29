package com.list;

public class CloneTheListWithNextAndRandomPointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node one = new Node();
		Node two = new Node();
		Node three = new Node();
		Node four = new Node();
		
		one.data = "1";
		two.data = "2";
		three.data = "3";
		four.data = "4";
		
		one.next = two;
		two.next = three;
		three.next = four;
		
		System.out.println("NEXT POINTERS : " + one.toString());
		
		one.arbit = four;
		two.arbit = three;
		three.arbit = one;
		four.arbit = two;

		System.out.println("ARBIT POINTERS : " + one.toStringArbit());
		
		cloneList(one);

	}
	
	public static void cloneList(Node node){
		Node temp = new Node();
		Node head = node;
		Node copy = temp;
		while(node.next!=null){
			temp.data = node.data;
			temp.next = node.next;
			node.next = temp;
			
			node = node.next.next;
			temp = new Node();
		}
		temp.data = node.data;
		temp.next = node.next;
		node.next = temp;
		
		//INSERTING DUPLICATE NODES DONE
		
		Node orignal = head;
		
		while(orignal != null){
			orignal.next.arbit = orignal.arbit.next;
			orignal = orignal.next.next;
		}//traverse two nodes
		
		orignal = head;
		Node copied = copy;
		while(copy.next!=null){
			orignal.next = orignal.next.next;
			
			copy.next = copy.next.next;
			
			orignal = orignal.next;
			
			copy = copy.next;
		}
		
		orignal.next = null;
		copy.next = null;
		System.out.println("\nOriginal List ------");
		System.out.println("NEXT POINTERS : " + head.toString());
		System.out.println("ARBIT POINTERS : " + head.toStringArbit());
		
		System.out.println("\nCopied List ------");
		System.out.println("NEXT POINTERS : " + copied.toString());
		System.out.println("ARBIT POINTERS : " + copied.toStringArbit());
		
	}

}
