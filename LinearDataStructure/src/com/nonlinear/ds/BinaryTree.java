package com.nonlinear.ds;

public class BinaryTree<X extends Comparable<X>> {

	private Node root;
	private int size;

	public BinaryTree() {
		super();
		this.root = null;
	}

	public int size() {
		return size;
	}

	public void add(X item) {
		Node node = new Node(item);

		if (root == null) {
			this.root = node;
			size++;
			System.out.println("Root Node set " + node.getItem());
		} else {
			insert(root, node);
		}
	}

	private void insert(Node parent, Node child) {

		if (parent.getItem().compareTo(child.getItem()) > 0) {

		}

	}

	private class Node {
		private Node left;
		private Node right;
		private Node parent;
		private X item;

		public Node(X item) {
			super();
			this.left = null;
			this.right = null;
			this.parent = null;
			this.item = item;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node getParent() {
			return parent;
		}

		public void setParent(Node parent) {
			this.parent = parent;
		}

		public X getItem() {
			return item;
		}

		public void setItem(X item) {
			this.item = item;
		}

	}
}
