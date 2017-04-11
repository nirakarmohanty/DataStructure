package com.src.nirakar.ds.queue;

import java.util.NoSuchElementException;

public class Queue {

	private int size;
	private int front;
	private int rear;
	private int length;
	private Object[] array;

	public Queue(int size, Object[] array) {

		this.size = size;
		array = new Object[size];
		this.front = -1;
		this.rear = -1;
		length = 0;
	}

	public boolean isEmpty()

	{
		return front == -1;

	}

	public boolean isFull()

	{
		return front == 0 && rear == size - 1;

	}

	public int getSize()

	{
		return length;

	}

	/* Function to check the front element of the queue */

	public Object peek()

	{

		if (isEmpty())

			throw new NoSuchElementException("Underflow Exception");

		return array[front];

	}

	public void insert(int i)

	{

		if (rear == -1)

		{
			front = 0;
			rear = 0;
			array[rear] = i;

		}

		else if (rear + 1 >= size)

			throw new IndexOutOfBoundsException("Overflow Exception");

		else if (rear + 1 < size)
			array[++rear] = i;
		length++;

	}

	public Object remove()

	{

		if (isEmpty())

			throw new NoSuchElementException("Underflow Exception");

		else

		{

			length--;

			Object ele = array[front];

			if (front == rear)

			{
				front = -1;

				rear = -1;

			}

			else

				front++;

			return ele;

		}

	}

}
