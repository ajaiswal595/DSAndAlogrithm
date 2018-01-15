package com.linear.ds;

import com.nonlinear.ds.Graph;

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
		
		
/*		Queue<String> queue= new Queue();
		queue.enqueue("Ajay");
		queue.enqueue("Rahul");
		queue.enqueue("Gopal");
		
		System.out.println(queue.size());
		System.out.println(queue.dequeue());
		//System.out.println(queue.dequeue());
		
		System.out.println(queue);
		System.out.println(queue.contains("Gopal"));
	*/	
		
/*		LinkedList<Integer> list=new LinkedList<Integer>();
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.traverse();
		
		*/
		
	CustomMap<String, String> map = new CustomMap<String, String>(10);
		
		map.put("0126ca121001", "Ajay");
		map.put("0126ca121002", "Aakash");
		map.put("0126ca121003", "Prashant");
		System.out.println(map.delete("0126ca121001"));
		
		
		
	/*	int ajay="0126ca121001".hashCode()%10;
		int akash="0126ca121002".hashCode()%10;
		int prashant="0126ca121003".hashCode()%10;

		
		System.out.println(ajay);
		System.out.println(akash);
		System.out.println(prashant);*/
		
		
	/*	System.out.println(map.get("0126ca121001"));
		System.out.println(map.get("0126ca121002"));
		System.out.println(map.get("0126ca121003"));
		
		map.put("0126ca121001", "Kumar");
		System.out.println(map.delete("0126ca121001").value);
		System.out.println(map.delete("0126ca121001"));
		
		map.put("0126ca121001", "www");
		System.out.println(map.get("0126ca121001"));
		System.out.println(map.get("0126ca121002"));
		System.out.println(map.get("0126ca121003"));
		
		*/
		
		Graph graph=new Graph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		
		graph.printGraph();
		
		
	}

}
