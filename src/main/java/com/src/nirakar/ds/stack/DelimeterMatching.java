package com.src.nirakar.ds.stack;

public class DelimeterMatching {

	public static void main(String[] args) {
		String params = "a[b+{c*(u-r)}]";
		System.out.println(delimeterMatching(params));

		params = "a[b+{c*(u-r)}}]";
		System.out.println(delimeterMatching(params));

		params = "a+b+c*u-r)}}]";
		System.out.println(delimeterMatching(params));
//
		params = "a[[b+{c*(u-r)}]";
		System.out.println(delimeterMatching(params));
	}

	private static String delimeterMatching(String params) {

		char[] charArray = params.toCharArray();
		DelimeterStack delimeterStack = new DelimeterStack(charArray.length);
		for (int i = 0; i < charArray.length; i++) {
			Character c = charArray[i];
			switch (c) {
			case '[':
			case '{':
			case '(':
				delimeterStack.push(c);
				break;
			default:
			}
			switch (c) {
			case ']':
			case '}':
			case ')': {
				Character peepC = delimeterStack.peep();
				if (peepC!=null && (
						peepC == '[' && c == ']' || peepC == '{' && c == '}' || peepC == '(' && c == ')')) {
					delimeterStack.pop();
				}else {
					//delimeterStack.push(c);
				}
			}
				break;
			default:
			}

		}
		return delimeterStack.peep() != null ? "Not Balanced" : "Balanced";
	}

}

class DelimeterStack {

	Character[] charArray;
	int length;
	int top;

	public DelimeterStack(int size) {
		length = size;
		top = -1;
		charArray = new Character[size];
	}

	public void push(Character c) {
		if (top < length) {
			charArray[++top] = c;
		}
	}

	public Character pop() {
		Character c = charArray[top];
		charArray[top] = null;
		--top;
		// System.out.print(c + "\t");
		return c;
	}

	public Character peep() {
		if (top > -1) {
			Character c = charArray[top];
			// System.out.print(c + "\t");
			return c;
		} else {
			return null;
		}

	}
}
