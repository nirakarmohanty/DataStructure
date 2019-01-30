package com.src.nirakar.ds.linkedlist.single.node;

/**
 * This class describes examples of Inserting Middle element in the Linked List
 * 
 * @author NIRAKAR
 * 
 */
public class PrintsMiddleOfLinkedList {

	private int length = 0;

	private Node node;

	PrintsMiddleOfLinkedList() {
		node = null;
	}

	// Insert element into the Linked List
	public void insert(int data) {

		if (node == null) {
			node = new Node(data);
			node.link = null;
		} else {
			Node currentNode = new Node(data);
			currentNode.link = node;
			node=currentNode;
		}

	}

	public void display() {
		Node currentNode = node;
		while (currentNode != null) {
			System.out.print(currentNode.data + "---->");
			currentNode=currentNode.link;
		}
		System.out.println("null");
	}

	public void getLength() {
		Node currentNode = node;
		while (currentNode != null) {
			++length;
			currentNode=currentNode.link;
		}
		System.out.println(length);
	}

	public void getMiddleElement() {
		int index=0;
		int middle=Math.abs(length/2);
		Node currentnode = node;
		while(currentnode!=null && index<middle)
		{
			++index;
			currentnode = currentnode.link;
		}
		System.out.println(currentnode);
	}

	public void getMiddleElementTypeII(){
		Node currentNode = node;
		Node nextNode =node;
		
		while(currentNode!=null && nextNode.link!=null){
			currentNode=currentNode.link;
			nextNode = currentNode.link;
		}
		System.out.println(currentNode.data);
	}
	
	
	public static void main(String[] args) {
			PrintsMiddleOfLinkedList printsMiddleOfLinkedList = new PrintsMiddleOfLinkedList();
			printsMiddleOfLinkedList.insert(1);
			printsMiddleOfLinkedList.insert(2);
			printsMiddleOfLinkedList.insert(3);
			printsMiddleOfLinkedList.insert(4);
			printsMiddleOfLinkedList.insert(5);
			
			printsMiddleOfLinkedList.display();
			printsMiddleOfLinkedList.getLength();
			
			printsMiddleOfLinkedList.getMiddleElement();
			
			printsMiddleOfLinkedList.getMiddleElementTypeII();
	}

}
