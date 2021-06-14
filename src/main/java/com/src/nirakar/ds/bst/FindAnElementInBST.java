package com.src.nirakar.ds.bst;

public class FindAnElementInBST {

	public static void main(String[] args) {
		FindAnElementInBST findAnElementInBST = new FindAnElementInBST();
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

		System.out.println("\n" + "Find a value in a BST ");
		findAnElementInBST.checkValueIfPresent(root, 13);
		System.out.println("\n" );
		findAnElementInBST.findAnElement(root, 6);
	}

	private void findAnElement(Node root, int i) {

		if (root == null)
			return;
		while (root != null) {

			if (root.data < i) {
				root = root.right;
			} else if (root.data > i) {
				root = root.left;
			} else {
				System.out.print("Present data : "+root.data + "\t");
				break;
			}
		}

	}

	// Recurssive way
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
