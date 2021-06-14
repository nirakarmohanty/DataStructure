package com.src.nirakar.ds.stack;

public class ReverseAString {

	public static void main(String[] args) {
		reverseString("ABCD");
	}

	private static void reverseString(String word) {
		
		if (word != null) {
			char[] charArray = word.toCharArray();
			int size = charArray.length;
			StackImplementation stackObject = new StackImplementation(size);
			for (int i = 0; i < charArray.length; i++) {
				stackObject.push(charArray[i]);
				// System.out.println(stackObject.pop());
			}
			String reverse="";
			for (int i = 0; i < charArray.length; i++) {
				reverse=reverse+(stackObject.pop());
			}
			System.out.println(reverse.toString() != null ? reverse.toString() : null);
		}
	}

}

class StackImplementation {
	int nLength;
	Character[] charArray;
	char c;
	int position = 0;

	public StackImplementation(int size) {
		this.nLength = size;
		charArray = new Character[size];
	}

	public void push(char c) {
		charArray[position] = c;
		++position;
	}

	public Character pop() {

		Character c = charArray[position - 1];
		charArray[position - 1] = null;
		--position;
		return c;
	}

}
