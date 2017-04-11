package com.test.nirakar.ds.stack;

import com.src.nirakar.ds.stack.Stack;

/**
 * @author NIRAKAR
 * 
 */
public class TestStack {
	public static void main(String[] args) {
		Object[] array = null;
		Stack s = new Stack(3, array);
		s.push(1);
		System.out.println(s.size());
		s.push(1);
		System.out.println(s.size());
		s.push(3);
		System.out.println(s.size());
		System.out.println(s.peep());
		s.pop();
		System.out.println(s.size());
		s.pop();
		System.out.println(s.size());
		s.pop();
		System.out.println(s.size());
	}

}
