package com.src.nirakar.ds.tree;

import java.util.Stack;

public class PreOrderTraversal {
	
	/**
	 * Creating Binary Tree
	 * @return
	 */
	public static Node insertNode() {
		BinaryTree bt = new BinaryTree();
		Node rootNode = bt.createNode(1);//creating rootNode here
		
		rootNode.left = bt.createNode(2);
		rootNode.right = bt.createNode(3);
		
		rootNode.left.left=bt.createNode(4);
		rootNode.left.right=bt.createNode(5);
		
		rootNode.left.left.left=bt.createNode(8);
		
		rootNode.right.left=bt.createNode(6);
		rootNode.right.right=bt.createNode(7);
		
		return rootNode;
		
	}

	/**
	 * PreOrder Iterative way
	 * @param rootNode
	 */
	public static void preOrderIterative(Node rootNode) {
		if(rootNode==null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		stack.push(rootNode);
		
		while(stack.size()>0) {
			Node node = stack.pop();
			System.out.print(node.data+"-->");
			if(node.right!=null) {
				stack.push(node.right);
			}
			if(node.left!=null) {
				stack.push(node.left);
			}
			
		}
		
	}
	
	/**
	 * PreOrder Recursive way
	 * @param rootNode
	 */
	public static void preOrderRecursive(Node rootNode) {
		
		if(rootNode ==null) {
			return;
		}else {
			System.out.print(rootNode.data+"--->");
			preOrderRecursive(rootNode.left);
			preOrderRecursive(rootNode.right);
		}
	}
	
	public static void main(String[] args) {
		
		Node node=insertNode();
		//PreOrder - Left - 1 2 4 8 5 3 6 7
		System.out.print("PreOrder with Recurssion" +"\n");
		preOrderRecursive(node);
		System.out.println("\n");
		//System.out.print("PreOrder with Iterative"+"\n");		
		//preOrderIterative(node);
	}

}
