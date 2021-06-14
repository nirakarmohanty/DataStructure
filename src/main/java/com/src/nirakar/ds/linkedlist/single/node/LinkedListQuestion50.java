package com.src.nirakar.ds.linkedlist.single.node;

public class LinkedListQuestion50 {

	public void pointToNextHigherValue(NodeQ50 head) {
		NodeQ50 currentNode = head;
		while (currentNode != null) {
			NodeQ50 nextNode = currentNode.nextPointer;
			if(nextNode.data>currentNode.data) {
				currentNode.arbitaryPointer=nextNode;
			}else {
				currentNode=currentNode.nextPointer;
			}
		}
	}

}

class NodeQ50 {
	int data;
	NodeQ50 arbitaryPointer;
	NodeQ50 nextPointer;

	public NodeQ50(int value) {
		this.data = value;
		this.arbitaryPointer = null;
		this.nextPointer = null;
	}
}
