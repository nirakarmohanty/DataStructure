package com.src.nirakar.ds.queue;

import java.util.NoSuchElementException;

/**
 * Queue implementation of Java
 * 
 * @author NIRAKAR
 * 
 */
public class Queue {

	private int size; // Size of the array
	private int front;// This will be used to hold the bottom element
	private int rear; // Pointer used in top element
	private int length; // Length of the object array.
	private Object[] array;// Variable used to hold the objects

	public Queue(int size, Object[] array) {

		this.size = size;
		array = new Object[size];
		this.front = -1;// Start with -1
		this.rear = -1; // Start with -1
		length = 0; // And initially the length of the array is 0
	}

	// Initially the FRONT variable value is -1 , if first element enters to the
	// array it's value will be  changed to 0 , so to check the array is empty or not , compare the value of front GT -1
	public boolean isEmpty()

	{
		return front == -1;
	}
	// If the REAR variable is equal to SIZE Variable 
	public boolean isFull()

	{
		return front == 0 && rear == size - 1;

	}
	// Return the length of the array
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
