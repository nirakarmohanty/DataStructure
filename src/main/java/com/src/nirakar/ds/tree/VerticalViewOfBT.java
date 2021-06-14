package com.src.nirakar.ds.tree;

import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public class VerticalViewOfBT {

	public static void main(String[] args) {
		BinaryTree a = new BinaryTree();

		Node root = a.createNode(2);
		root.left = a.createNode(7);
		root.right = a.createNode(5);
		root.left.left = a.createNode(2);
		root.left.right = a.createNode(6);
		root.left.right.left = a.createNode(5);
		root.left.right.right = a.createNode(11);
		root.right.right = a.createNode(9);
		root.right.right.left = a.createNode(4);

		printVerticalOrder(root);
	}

	private static void printVerticalOrder(Node root) {
		if (root == null) {
			return;
		}
		int hd = 0;

		Map<Integer, ArrayList<Integer>> m = new TreeMap<Integer, ArrayList<Integer>>();

		getVerticalOrder(root, hd, m);

		for (Map.Entry<Integer, ArrayList<Integer>> cm : m.entrySet()) {
			System.out.println(cm.getValue());
		}

	}

	private static void getVerticalOrder(Node root, int hd, Map<Integer, ArrayList<Integer>> m) {
		if (root == null) {
			return;
		}

		if (m.get(hd) == null) {
			ArrayList<Integer> l = new ArrayList<Integer>();
			l.add(root.data);
			m.put(hd, l);
		} else {
			ArrayList<Integer> l = m.get(hd);
			l.add(root.data);
			m.put(hd, l);
		}

		getVerticalOrder(root.left, hd - 1, m);
		getVerticalOrder(root.right, hd + 1, m);

	}

}
