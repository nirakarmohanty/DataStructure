package com.src.nirakar.ds.tree;

/**
 * @author Nirakar
 * Print All Leaf Nodes in a Binary tree
 * Count ALl leaf Nodes
 */
public class LeafNodesPrint {

	public static void main(String[] args) {

		BinaryTree a = new BinaryTree();
		Node root = a.createNode(1);
		root.left = a.createNode(2);
		root.right = a.createNode(3);

		root.left.left = a.createNode(4);
		root.left.right = a.createNode(5);

		root.right.left = a.createNode(6);
		root.right.right = a.createNode(7);

		root.right.left.left = a.createNode(8);
		root.right.left.right = a.createNode(9);
		printAllLeafNodes(root);
		System.out.print("\n");
		System.out.println(countLeafNodes(root));

	}

	private static void printAllLeafNodes(Node root) {

		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			System.out.print(root.data+"\t");
			return;
		}

		else {
			printAllLeafNodes(root.left);
			printAllLeafNodes(root.right);
		}

	}
	private static int countLeafNodes(Node root) {

		if (root == null)
			return 0;
		if (root.left == null && root.right == null) {
			//System.out.print(root.data+"\t");
			//++count;
			return 1;
		}

		else {
			 return countLeafNodes(root.left) + 
					 countLeafNodes(root.right);
		}

	}

}
