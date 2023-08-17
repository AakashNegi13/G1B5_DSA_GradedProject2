package com.greatlearning.transactions;

public class DriverApp {

	public static void main(String[] args) {
		ConvertBST tree = new ConvertBST();
		tree.node = new MyNode(50);
		tree.node.left = new MyNode(30);
		tree.node.right = new MyNode(60);
		tree.node.left.left = new MyNode(10);
		tree.node.right.left = new MyNode(55);

		tree.convertToSkewed(tree.node);
		tree.printlnOrder(tree.node);

	}

}
