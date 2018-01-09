package com.linear.ds;

public class LinkedList<X> {

	Node first;
	Node last;
	int counter;

	public LinkedList() {
		super();
		this.first = null;
		this.last = null;
		this.counter = 0;
	}

	private class Node {
		X item;
		Node next;
	}

	public void addFirst(X input) {
		Node firstNode = new Node();
			firstNode.item=input;
		if (first == null) {
			first = new Node();
			first.next = firstNode;
			firstNode.next = last;
		} else {
			firstNode.next = first.next;
			first.next = firstNode;
		}
	}
	
	public void traverse() {
		Node temp=first.next;
		
		while(temp.next!=null) {
			System.out.print(temp.item);
			temp=temp.next;
		}
	}
}
