package com.src.nirakar.ds.linkedlist.single.node;

public class ToyNode {
	private String name;
	private double price;
	private int count;
	private ToyNode next;

	public ToyNode(String name, double price, int count, ToyNode next) {
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

	public ToyNode getNext() {
		return next;
	}

	public void setNext(ToyNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "ToyNode [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
}
