package com.src.nirakar.ds.linkedlist.single.node;

public class InsertNodeAtTail {
	Node head;

	public InsertNodeAtTail() {
		this.head = null;
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
			System.out.print(currentNode.data + "-->");
			currentNode = currentNode.link;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		InsertNodeAtTail insertNodeAtTail = new InsertNodeAtTail();

		insertNodeAtTail.insert(1);
		insertNodeAtTail.insert(2);
		insertNodeAtTail.insert(3);
		insertNodeAtTail.print();
		insertNodeAtTail.insertElementsAtTail(4);
		System.out.println("\n");
		insertNodeAtTail.print();
	}

	private void insertElementsAtTail(int i) {

		Node newNode = new Node(i);
		Node currentNode = head;
		

		while (currentNode.link != null) 
		{

			currentNode = currentNode.link;
			
		}
		currentNode.link=newNode;
		newNode.link=null;

	}

}
