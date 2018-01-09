package com.linear.ds;

public class Stack<x> {
	private x[] data;
	private int i=0;
	private int size=0;
	public Stack() {
		this(1000);
	}

	public Stack(int size) {
		data = (x[]) new Object[size];
		this.size=size;		
	}
	
	public x push(x item) {
		data[i++]=item;
		return item;
	}
	
	public x pop() {
		if(i<0) {
			throw new IllegalStateException("There is no item remain in stack");
		}
		return data[i--];
	}
	
	public boolean isEmpty() {
		if(i<0)
		return true;
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public x elementAt(int index) {
		return data[index];
	}
}
