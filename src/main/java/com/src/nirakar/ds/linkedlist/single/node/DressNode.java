package com.src.nirakar.ds.linkedlist.single.node;

public class DressNode {
	private String name;
	private double price;
	private int count;
	private DressNode next;

	public DressNode(String name, double price, int count, DressNode next) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.next = null;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public DressNode getNext() {
		return next;
	}

	public void setNext(DressNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "DressNode [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
}
