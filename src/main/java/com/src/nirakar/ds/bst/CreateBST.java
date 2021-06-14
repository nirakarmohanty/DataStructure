package com.src.nirakar.ds.bst;

public class CreateBST {

	public static void main(String[] args) {

		CreateBST createBST = new CreateBST();
		Node root = null;
		root = createBST.insert(root, 8);
		root = createBST.insert(root, 3);
		root = createBST.insert(root, 6);
		root = createBST.insert(root, 10);
		root = createBST.insert(root, 4);
		root = createBST.insert(root, 7);
		root = createBST.insert(root, 1);
		root = createBST.insert(root, 14);
		root = createBST.insert(root, 13);
		System.out.println("Printing InOrder " + "\t");
		// Print InOrder
		createBST.printBSTInOrder(root);
		System.out.println("\n" + "Printing PreOrder ");
		createBST.printBSTPreOrder(root);
		System.out.println("\n" + "Printing PostOrder ");
		createBST.printBSTPostOrder(root);
		System.out.println("\n" + "Find a value in a BST ");
		createBST.checkValueIfPresent(root, 13);
	}

	public Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			root.right = null;
			root.left = null;
			return root;
		}
		if (data < root.data) {
			root.left = insert(root.left, data);

		}

		if (data > root.data) {
			root.right = insert(root.right, data);

		}

		return root;

	}

	/**
	 * Print elements in Inorder (Sorted/ Ascending)
	 * 
	 * @param root
	 */
	public void printBSTInOrder(Node root) {
		if (root == null)
			return;
		else {
			printBSTInOrder(root.left);
			System.out.print(root.data + "\t");
			printBSTInOrder(root.right);

		}

	}

	/**
	 * Print elements in PreOrder manner
	 * 
	 * @param root
	 */
	public void printBSTPreOrder(Node root) {
		if (root == null)
			return;
		else {
			System.out.print(root.data + "\t");
			printBSTPreOrder(root.left);
			printBSTPreOrder(root.right);

		}
	}

	private void printBSTPostOrder(Node root) {
		if (root == null)
			return;
		else {
			printBSTPostOrder(root.left);
			printBSTPostOrder(root.right);
			System.out.print(root.data + "\t");
		}
	}

	private void checkValueIfPresent(Node root, int value) {
		if (root == null)
			return;
		if (root.data == value)
			System.out.print(root.data + "\t");

		if (value < root.data)
			checkValueIfPresent(root.left, value);

		else if (value > root.data)
			checkValueIfPresent(root.right, value);

	}
}
