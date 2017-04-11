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

	/**
	 * 
	 */
	public Object pop() {
		Object o_variable = null;
		if (index >= 0) {
			o_variable = array[index];
			--index;
		}
		return o_variable;
	}

	/**
	 * Return the top most element in the Stack
	 * 
	 * @return
	 */
	public Object peep() {
		return (size() > -1 ? array[index] : null);
	}
}
