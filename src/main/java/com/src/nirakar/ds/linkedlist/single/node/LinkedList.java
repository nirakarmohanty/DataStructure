package com.src.nirakar.ds.linkedlist.single.node;

public class LinkedList {

	Node head;

	public LinkedList() {
		head = null;
	}

	public void display() {
		if (head != null) {
			Node currentNode = head;
			while (currentNode != null) {
				System.out.print(currentNode.data + "------->");
				currentNode = currentNode.link;
			}
			System.out.print("null");
		}
	}

	public void insertElemnt(int data) {
		if (head == null)
			head = new Node(data);
		else {
			Node newNode = new Node(data);
			newNode.link = head;
			head = newNode;
		}
	}

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.insertElemnt(1);
		linkedList.insertElemnt(2);

		linkedList.display();

	}

}
