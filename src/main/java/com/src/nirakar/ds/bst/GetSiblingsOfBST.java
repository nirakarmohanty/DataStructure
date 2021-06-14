package com.src.nirakar.ds.bst;

public class GetSiblingsOfBST {

	public static void main(String[] args) {
		GetSiblingsOfBST siblingsOfBST = new GetSiblingsOfBST();
		Node root = null;
		root = siblingsOfBST.insertElement(root, 8);
		root = siblingsOfBST.insertElement(root, 3);
		root = siblingsOfBST.insertElement(root, 6);
		root = siblingsOfBST.insertElement(root, 10);
		root = siblingsOfBST.insertElement(root, 4);
		root = siblingsOfBST.insertElement(root, 7);
		root = siblingsOfBST.insertElement(root, 1);
		root = siblingsOfBST.insertElement(root, 14);
		root = siblingsOfBST.insertElement(root, 13);
		siblingsOfBST.printBSTInOrder(root);
		System.out.println("\n");
		Node tempParent=null;
		siblingsOfBST.findSiblings(root, 13,tempParent);
	}

	// FInd parent node first
	// Hold it to some temp Node and get the right or left node
	private void findSiblings(Node root, int value,Node tempParent) {
		//Node temp = root;
		if (root == null)
			return ;
		if (value < root.data) {
			tempParent=root;
			findSiblings(root.left, value,tempParent);			
		} else if (value > root.data) {
			tempParent=root;
			findSiblings(root.right, value,tempParent);
		} else {
			System.out.println("Value found : " + root.data);
			System.out.println("Temp found : " + tempParent.data);
			findSiblingData(tempParent,root.data);
		}
		//return temp;

	}

	private void findSiblingData(Node tempParent, int data) {
		if(tempParent.left != null && tempParent.left.data == data ) {
			if(tempParent.right !=null) {
				System.out.println("Found sibling and value is : " +  tempParent.right.data);	
			}
			
		}
		else if(tempParent.right != null && tempParent.right.data == data ) {
			System.out.println("Found sibling and value is : " + tempParent.left !=null ? tempParent.left.data : null);
		}else {
			System.out.println("No siblings found for : " + data);
		}
		
	}

	private Node insertElement(Node root, int value) {

		if (root == null) {
			root = new Node(value);
			root.left = null;
			root.right = null;
			return root;
		}
		if (value < root.data) {
			root.left = insertElement(root.left, value);
			return root;
		} else if (value > root.data) {
			root.right = insertElement(root.right, value);
			return root;
		} else
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

}
