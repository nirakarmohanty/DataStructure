package com.src.nirakar.ds.linkedlist.single.node;

public class Node {

	public int data;// This is the data which is nothing but actual data

	public Node link; // This is pointer field , i.e. this variable is used to reffer to the next field

	public Node(int data) {
		this.data = data;
		this.link = null;

	}

	public String toString() {

		return data + " " ;
	}

}
