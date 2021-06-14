package com.src.nirakar.ds.bst;

public class GetInorderParent {

	public static void main(String[] args) {
		GetInorderParent getInorderParent = new GetInorderParent();
		Node root = null;
		root = getInorderParent.insertElement(root, 8);
		root = getInorderParent.insertElement(root, 3);
		root = getInorderParent.insertElement(root, 6);
		root = getInorderParent.insertElement(root, 10);
		root = getInorderParent.insertElement(root, 4);
		root = getInorderParent.insertElement(root, 7);
		root = getInorderParent.insertElement(root, 1);
		root = getInorderParent.insertElement(root, 14);
		root = getInorderParent.insertElement(root, 13);
		int value = 6;
		printInorderParent(root, value);

	}
	private static void printInorderParent(Node root, int value) {
		
		if(root==null) {
			return;
		}
		
	}
	public Node insertElement(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			root.right = null;
			root.left = null;
			return root;
		}
		if (data < root.data) {
			root.left = insertElement(root.left, data);
		}
		if (data > root.data) {
			root.right = insertElement(root.right, data);
		}
		return root;

	}
}
