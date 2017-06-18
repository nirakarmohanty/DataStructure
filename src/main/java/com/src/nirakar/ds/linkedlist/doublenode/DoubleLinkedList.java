package com.src.nirakar.ds.linkedlist.doublenode;

public class DoubleLinkedList {

	private Node head;

	private Node tail;

	public DoubleLinkedList() {

	}

	/**
	 * 
	 */
	public void displayBackward() {

	}

	/**
	 * 
	 */
	public void displayForward() {

		if (head != null) {

			Node currentNode = head;
			while (currentNode != null) {
				System.out.print(currentNode.data + " --------> ");
				currentNode = currentNode.next;
			}

			System.out.print("null");
		}
	}

	/**
	 * @param data
	 */
	public void insertLast(int data) {

	}

	/**
	 * @param data
	 */
	public void insertFirst(int data) {
		if (head == null) {
			head = new Node(data);
			head.next = null;
			head.previous = null;
		} else {
			Node newNode = new Node(data);
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

	public static void main(String[] args) {

		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.insertFirst(1);
		doubleLinkedList.insertFirst(2);
		doubleLinkedList.insertFirst(3);

		doubleLinkedList.displayForward();
	}

}
