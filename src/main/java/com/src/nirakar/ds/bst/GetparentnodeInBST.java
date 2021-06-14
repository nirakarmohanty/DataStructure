package com.src.nirakar.ds.bst;

public class GetparentnodeInBST {

	public static void main(String[] args) {
		GetparentnodeInBST getparentnodeInBST = new GetparentnodeInBST();
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

		System.out.println("\n" + "*********** Find parent Node of a Value in BST **********");
		getparentnodeInBST.findParentNode(root, 13);
	}

	private void findParentNode(Node root, int value) {
		// If root is null , return
		if (root == null)
			return;
		Node temp = null;
		while (root != null) {
			if (value < root.data) {
				temp = root;
				root = root.left;
			} else if (value > root.data) {
				temp = root;
				root = root.right;

			} else {
				// temp = root;
				System.out.println("Data found : " + "\t" + root.data);
				break;
			}
		}

		System.out.println("parent node of Data  : " + "\t" + (temp == null ? null : temp.data));
	}

}
