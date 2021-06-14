package com.src.nirakar.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOrderTraversal {

	public static void main(String[] args) {
		ReverseOrderTraversal a = new ReverseOrderTraversal();

		Node root = a.createNewNode(2);
		root.left = a.createNewNode(7);
		root.right = a.createNewNode(5);
		root.left.left = a.createNewNode(2);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);
		root.right.right = a.createNewNode(9);
		root.right.right.left = a.createNewNode(4);
		reverseTraversalWithoutRecursion(root);

	}

	public static void reverseTraversalWithoutRecursion(Node node) {
		if (node == null) {
			return;
		}
		// Define A queue
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		// Define a Stack
		Stack<Node> s = new Stack<Node>();

		while (q.size() > 0) {
			// Get the first one from Queue
			Node t = q.remove();
			// Push it to Stack
			s.push(t);

			if (t.right != null) {
				q.add(t.right);
			}

			if (t.left != null) {
				q.add(t.left);
			}
		}

		while (!s.isEmpty()) {
			System.out.print(s.pop().data + " ");
		}
	}

	public Node createNewNode(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}

}
