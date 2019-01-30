package com.src.nirakar.ds.linkedlist.single.node;

/**
 * This class demonstrates how to print LinkedList
 * 
 * @author NIRAKAR
 * 
 */
public class PrintsElementInLinkedList {

	Node head;

	public PrintsElementInLinkedList() {
		this.head = null;
	}

	public static void main(String[] args) {

		PrintsElementInLinkedList printsElementInLinkedList = new PrintsElementInLinkedList();
		printsElementInLinkedList.insert(1);
		printsElementInLinkedList.insert(2);
		printsElementInLinkedList.insert(3);
		printsElementInLinkedList.print();
	}

	private void insert(int data) {

		if (head == null) {
			head = new Node(data);
			head.link = null;
		} else {
			Node newNode = new Node(data);
			newNode.link = head;
			head = newNode;
		}

	}

	/**
	 * Without passing the Head value
	 */
	private void print() {

		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.link;
		}

	}

	/**
	 * By Passing the Head value to the print method
	 * 
	 * @param head
	 */
	private void print(Node head) {

		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.link;
		}

	}

}
