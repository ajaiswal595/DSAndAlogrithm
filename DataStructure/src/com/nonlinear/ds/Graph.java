package com.nonlinear.ds;

import java.util.LinkedList;

public class Graph {

	int vertices;
	LinkedList<Integer> adjucencyArray[];

	public Graph(int vertices) {
		this.vertices = vertices;
		adjucencyArray = new LinkedList[vertices];

		for (int i = 0; i < vertices; i++) {
			adjucencyArray[i] = new LinkedList();
		}
	}

	public void addEdge(int source, int destination) {
		adjucencyArray[source].addFirst(destination);
		adjucencyArray[destination].addFirst(source);
	}

	public void printGraph() {
		for (int i = 0; i < vertices; i++) {
			System.out.println("Head " + i);
			for (Integer destination : adjucencyArray[i]) {
				System.out.println(i+ " -> " + destination);
			}
		}
	}

}
