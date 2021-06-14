package com.src.nirakar.ds.tree;

public class RightViewOfBT {
	int maxLevel=0;
	public static void main(String[] args) {
		BinaryTree a = new BinaryTree();

		Node root = a.createNode(2);
		root.left = a.createNode(7);
		root.right = a.createNode(5);
		root.left.left = a.createNode(2);
		root.left.right = a.createNode(6);
		root.left.right.left = a.createNode(5);
		root.left.right.right = a.createNode(11);
		root.right.right = a.createNode(9);
		root.right.right.left = a.createNode(4);
		
		RightViewOfBT leftViewOfBT= new RightViewOfBT();
		leftViewOfBT.leftViewOfTree(root, 0);

	}

	public void leftViewOfTree(Node node, int level) {
		if (node == null) {
			return;
		}

		if (level >= maxLevel) {
			System.out.print(node.data + " ");
			maxLevel++;
		}
		leftViewOfTree(node.right, level + 1);
		leftViewOfTree(node.left, level + 1);
		
	}

}
