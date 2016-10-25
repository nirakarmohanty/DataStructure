package com.src.nirakar.ds.stack;

/**
 * @author NIRAKAR
 *
 */
public class Stack {

	private int size;
	private int index;
	private Object[] array;

	public Stack(int size, Object[] arr) {
		this.size = size;
		this.array = new Object[size];
		index = -1;
	}

	public int size() {
		return index + 1;
	}

	public boolean isFull() {

		return (size == index ? true : false);
	}

	public void push(Object o) {
		if (!isFull()) {
			array[++index] = o;
		}
	}

	public void pop() {
		if (index >= 0) {
			array[index] = 0;
			--index;
		}
	}
}
