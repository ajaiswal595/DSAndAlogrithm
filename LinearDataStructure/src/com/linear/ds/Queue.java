package com.linear.ds;

public class Queue<X> {

	private X[] data;
	private int front;
	private int end;
	
	public Queue() {
		this(1000);
	}
	
	public Queue(int size) {
		this.front=-1;
		this.end=-1;
		data=(X[])new Object[size];
	}
	
	
	public int size() {
	 return end-front;	
	}
	
	public int enqueue(X input) {
		if(data.length>end) {
			data[++end]=input;
		}else {
			throw new IllegalStateException("Maximum Capacity filled for the queue");
		}
		return end;
	}
	
	public X dequeue() {
		if(front==end) {
			front=-1;
			end=-1;
			throw new IllegalStateException("There is no item remain in queue");
		}else {
			return data[front++];
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i=front+1;i<=end;i++) {
			sb.append(data[i]+",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
}
