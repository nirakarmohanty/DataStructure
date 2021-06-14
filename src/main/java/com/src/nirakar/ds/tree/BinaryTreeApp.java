package com.src.nirakar.ds.tree;

public class BinaryTreeApp {

	/*
	 * 1 / \ 2 3 / \ / \ 4 5 6 7 / \ 8 9
	 */
	public Node insertNode() {
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
		return rootNode;
	}

	public void preOrder(Node rootNode) {
		if (rootNode == null)
			return;
		else {
			System.out.print(rootNode.data + " ");
			preOrder(rootNode.left);
			preOrder(rootNode.right);
		}
	}

	public void inOrder(Node rootNode) {
		if (rootNode == null)
			return;
		else {
			inOrder(rootNode.left);
			System.out.print(rootNode.data + " ");
			inOrder(rootNode.right);
		}
	}

	public void postOrder(Node rootNode) {
		if (rootNode == null)
			return;
		else {
			postOrder(rootNode.left);
			postOrder(rootNode.right);
			System.out.print(rootNode.data + " ");
		}
	}

	public int getSumOfAllNodes(Node rootNode) {
		if (rootNode == null)
			return 0;
		else {
			return rootNode.data + getSumOfAllNodes(rootNode.left) + getSumOfAllNodes(rootNode.right);
		}
	}

	public int getDifferencesOfNodes(Node rootNode) {
		if (rootNode == null)
			return 0;
		else {
			return rootNode.data + getSumOfAllNodes(rootNode.left) - getSumOfAllNodes(rootNode.right);
		}

	}

	public int getAllNoOfNodes(Node rootNode) {
		if (rootNode == null)
			return 0;
		else {
			return 1 + getAllNoOfNodes(rootNode.left) + getAllNoOfNodes(rootNode.right);
		}
	}

	// Count All Lead Nodes
	public int countAllLeafNodes(Node rootNode) {
		if (rootNode == null)
			return 0;
		if (rootNode.left == null && rootNode.right == null)
			return 1;
		return countAllLeafNodes(rootNode.left) + countAllLeafNodes(rootNode.right);
	}

	public int getHeight(Node rootNode) {

		if (rootNode == null)
			return 0;
		else {
			return 1 + Math.max(getHeight(rootNode.left), getHeight(rootNode.right));
		}

	}

	public static void main(String[] args) {
		BinaryTreeApp btApp = new BinaryTreeApp();
		Node rootNode = btApp.insertNode();
		System.out.println("Pre Order Traversal");
		btApp.preOrder(rootNode);
		System.out.println("\n" + "In Order Traversal");
		btApp.inOrder(rootNode);
		System.out.println("\n" + "Post Order Traversal");
		btApp.postOrder(rootNode);

		System.out.print("\n" + "Sum of All Nodes :" + btApp.getSumOfAllNodes(rootNode));

		System.out.print("\n" + "Differnece of All Nodes :" + btApp.getDifferencesOfNodes(rootNode));

		System.out.print("\n" + "Get All Nodes :" + btApp.getAllNoOfNodes(rootNode));

		System.out.print("\n" + "Count All Leaf Nodes :" + btApp.countAllLeafNodes(rootNode));

	}
}
