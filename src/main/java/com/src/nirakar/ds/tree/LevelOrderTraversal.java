package com.src.nirakar.ds.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		Node rootNode = bt.createNode(1);// creating rootNode here

		rootNode.left = bt.createNode(2);
		rootNode.right = bt.createNode(3);

		rootNode.left.left = bt.createNode(4);
		rootNode.left.right = bt.createNode(5);

		rootNode.right.left = bt.createNode(6);
		rootNode.right.right = bt.createNode(7);

		rootNode.right.right.right = bt.createNode(8);
		rootNode.right.right.left = bt.createNode(9);
		levelOrderTraverse(rootNode);

	}
  
	public static void levelOrderTraverse(Node root) {
		// create an empty queue and enqueue the root node
		Queue<Node> queue = new ArrayDeque();
		queue.add(root);

		// to store the current node
		Node curr;

		// loop till queue is empty
		while (!queue.isEmpty()) {
			// process each node in the queue and enqueue their
			// non-empty left and right child
			curr = queue.poll();

			System.out.print(curr.data + " ");

			if (curr.left != null) {
				queue.add(curr.left);
			}

			if (curr.right != null) {
				queue.add(curr.right);
			}
		}
	}

}


