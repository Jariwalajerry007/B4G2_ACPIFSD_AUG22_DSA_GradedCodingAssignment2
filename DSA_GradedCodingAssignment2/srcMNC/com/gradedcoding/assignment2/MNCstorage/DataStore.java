package com.gradedcoding.assignment2.MNCstorage;

class Node {
	int val;
	Node left, right;

	Node(int item) {
		val = item;
		left = right = null;
	}
}

class DataStore {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	// Function to flatten the BST
	// search tree into a skewed tree in increasing || decreasing order
	static void flat2skewed(Node root, int order) {

		if (root == null) {
			return;
		}

		// Condition to check the order in which the skewed tree to maintained
		if (order > 0) {
			flat2skewed(root.right, order);
		} else {
			flat2skewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		// Condition to check weather the root Node of the skewed tree is undefined !!
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		// Similarly recurse for the left || right

		if (order > 0) {
			flat2skewed(leftNode, order);
		} else {
			flat2skewed(rightNode, order);
		}
	}

	// Function to traverse the Right Skewed tree using Recursion
	static void RightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		RightSkewed(root.right);
	}
	
// M A I N   C O D E 
	
	public static void main(String[] args) {

		node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.right.left = new Node(40);

		// Order of the Skewed tree can be defined by Choosing < 0 || 1 >
		// For Increasing order: 0 && For Decreasing order: 1
		
		int order = 0;
		flat2skewed(node, order);
		RightSkewed(headNode);
	}
}