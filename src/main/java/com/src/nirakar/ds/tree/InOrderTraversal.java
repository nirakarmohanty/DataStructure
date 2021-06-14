package com.src.nirakar.ds.tree;

public class InOrderTraversal {

	/**
	 * Creating Binary Tree
	 * 
	 * @return
	 */
	public static Node insertNode() {
		BinaryTree bt = new BinaryTree();
		Node rootNode = bt.createNode(1);// creating rootNode here

		rootNode.left = bt.createNode(2);
		rootNode.right = bt.createNode(3);

		rootNode.left.left = bt.createNode(4);
		rootNode.left.right = bt.createNode(5);

		rootNode.left.left.left = bt.createNode(8);

		rootNode.right.left = bt.createNode(6);
		rootNode.right.right = bt.createNode(7);

		return rootNode;

	}

	public static void inOrderRecursive(Node rootNode) {

		if (rootNode == null) {
			return;
		} else {
			inOrderRecursive(rootNode.left);
			System.out.print(rootNode.data + "--->");
			inOrderRecursive(rootNode.right);
		}
	}

	public static void main(String[] args) {
		Node node = insertNode();
		System.out.println("InOrder Traversal");
		inOrderRecursive(node);
	}

}
