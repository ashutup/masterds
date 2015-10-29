package com.list;

import com.tree.TreeNode;

public class Node {
	
	
	public String data;
	public int data1;
	public Node next = null;
	public Node prev = null;
	public Node arbit = null;
	
	public int length(){
		int size = 0 ;
		Node node = this;
		while(node != null){
			size++;
			node = node.next;
		}
		return size;
	}
	
	public Node doublyAppend(int data){
		Node startingPoint = this;
		
		if(this.data1 == 0 && this.next == null){
			this.data1 = data;
			return this;
		}
		
		while(startingPoint.next != null){
			startingPoint = startingPoint.next;
		}
		Node nodeToAppend = new Node();
		nodeToAppend.data1 = data;
		startingPoint.next = nodeToAppend;
		nodeToAppend.prev = startingPoint;
		
		return nodeToAppend;
		
	}
	
	public String printDoublyLinkedList() {
		StringBuffer buf = new StringBuffer();
		Node node = this;
		
		while(node.next != null){
			buf.append(node.data1 + " -> ");
			node = node.next;
		}
		buf.append(node.data1 + " -> ");
		buf.append(" REVERSE -> ");
		while(node.prev != null){
			buf.append(node.data1 + " -> ");
			node = node.prev;
		}
		buf.append(node.data1 + " -> ");
		buf.append("NULL");
		return buf.toString();
	}
	
	
	public Node appendToTail(String data){
		Node startingPoint = this;
		
		if(this.data == null && this.next == null){
			this.data = data;
			return this;
		}
		
		while(startingPoint.next != null){
			startingPoint = startingPoint.next;
		}
		Node nodeToAppend = new Node();
		nodeToAppend.data = data;
		startingPoint.next = nodeToAppend;
		
		return nodeToAppend;
		
	}
	
	
	public Node appendToTail(int data){
		Node startingPoint = this;
		
		if(this.data1 == 0 && this.next == null){
			this.data1 = data;
			return this;
		}
		
		while(startingPoint.next != null){
			startingPoint = startingPoint.next;
		}
		Node nodeToAppend = new Node();
		nodeToAppend.data1 = data;
		startingPoint.next = nodeToAppend;
		
		return nodeToAppend;
		
	}
	
	public Node appendToTail(Node node){
		Node startingPoint = this;
		
		
		
		while(startingPoint.next != null){
			startingPoint = startingPoint.next;
		}
		
		startingPoint.next = node;
		
		return startingPoint;
		
	}
	
	
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		Node node = this;
		
		while(node.next != null){
			buf.append(node.data + " -> ");
			node = node.next;
		}
		buf.append(node.data + " -> ");
		buf.append("NULL");
		return buf.toString();
	}
	
	public String toStringInt() {
		StringBuffer buf = new StringBuffer();
		Node node = this;
		
		while(node.next != null){
			buf.append(node.data1 + " -> ");
			node = node.next;
		}
		buf.append(node.data1 + " -> ");
		buf.append("NULL");
		return buf.toString();
	}
	
	public String toStringArbit(){
		StringBuffer buf = new StringBuffer();
		Node node = this;
		
		while(node.next != null){
			buf.append(node.arbit.data + " -> ");
			node = node.next;
		}
		buf.append(node.arbit.data + " -> ");
		buf.append("NULL");
		return buf.toString();
	}

}
