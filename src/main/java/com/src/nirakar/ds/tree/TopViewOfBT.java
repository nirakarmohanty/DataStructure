package com.src.nirakar.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBT {

	public static void main(String[] args) {
		TopViewOfBT a = new TopViewOfBT();

		NodeNew root = a.createNewNode(2);
		root.left = a.createNewNode(7);
		root.right = a.createNewNode(5);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.left.left = a.createNewNode(10);
		root.left.right.right = a.createNewNode(11);
		root.right.right = a.createNewNode(9);
		topView(root);
	}

	private static void topView(NodeNew node) {
		if (node == null) {
			return;
		}

		TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();

		Queue<NodeNew> q = new LinkedList<NodeNew>();
		q.add(node);

		while (!q.isEmpty()) {
			NodeNew temp = q.remove();
			int hd = temp.height;

			if (m.get(hd) == null) {
				m.put(hd, temp.data);
			}

			if (temp.left != null) {
				temp.left.height = hd - 1;
				q.add(temp.left);
			}

			if (temp.right != null) {
				temp.right.height = hd + 1;
				q.add(temp.right);
			}
		}
		System.out.println(m.values());

	}

	public NodeNew createNewNode(int val) {
		NodeNew newNode = new NodeNew();
		newNode.data = val;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}

}

