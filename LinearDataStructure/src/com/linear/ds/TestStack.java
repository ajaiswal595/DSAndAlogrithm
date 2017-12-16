package com.linear.ds;

public class TestStack {

	public static void main(String[] args) {
		Stack<String> stringStack = new Stack();
		Stack<Integer> intStack = new Stack();
		
	/*	stringStack.pop();
		stringStack.pop();
		
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(55);
		System.out.println(intStack.elementAt(3));
	/*	
		java.util.Stack<String> stack= new java.util.Stack<String>();
		String str =stack.push("Hello");
		System.out.println(str);
		stack.*/
		
		
		Queue<String> queue= new Queue();
		queue.enqueue("Ajay");
		queue.enqueue("Rahul");
		queue.enqueue("Gopal");
		
		System.out.println(queue.size());
		System.out.println(queue);
	}

}
