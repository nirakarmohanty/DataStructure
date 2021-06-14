/*
 * package com.src.nirakar.ds.tree;
 * 
 * public class TwoBTAreEqualOrNot { // Recursive function to check if two given
 * binary trees are identical or not public static boolean isIdentical(Node1 x,
 * Node1 y) { // if both trees are empty, return true if (x == null && y ==
 * null) { return true; }
 * 
 * // if both trees are non-empty and the value of their root Node1 matches, //
 * recur for their left and right subtree return (x != null && y != null) &&
 * (x.key == y.key) && isIdentical(x.left, y.left) && isIdentical(x.right,
 * y.right); }
 * 
 * public static void main(String[] args) { // construct the first tree Node1 x
 * = new Node1(15); x.left = new Node1(10); x.right = new Node1(20); x.left.left
 * = new Node1(8); x.left.right = new Node1(12); x.right.left = new Node1(16);
 * x.right.right = new Node1(25);
 * 
 * // construct the second tree Node1 y = new Node1(15); y.left = new Node1(10);
 * y.right = new Node1(20); y.left.left = new Node1(8); y.left.right = new
 * Node1(12); y.right.left = new Node1(16); y.right.right = new Node1(25);
 * 
 * if (isIdentical(x, y)) {
 * System.out.print("The given binary trees are identical"); } else {
 * System.out.print("The given binary trees are not identical"); } }
 * 
 * }
 * 
 * class Node1 { int key; Node1 left = null, right = null;
 * 
 * Node1(int key) { this.key = key; } }
 */