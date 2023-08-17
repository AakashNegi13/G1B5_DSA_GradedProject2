package com.greatlearning.transactions;

public class ConvertBST {
	MyNode node;

	public void convertToSkewed(MyNode root) {
		if (root == null || root.left == null)
			return;

		convertToSkewed(root.left);

		int temp = root.data;
		MyNode right = root.right;

		root.data = root.left.data;
		root.right = root.left.right;
		root.left = root.left.left;

		MyNode curr = root;
		while (curr.right != null) {
			curr = curr.right;

		}

		curr.right = new MyNode(temp);
		curr.right.right = right;

	}

	public void printlnOrder(MyNode root) {
		if (root == null)
			return;

		printlnOrder(root.left);
		System.out.print(root.data + " ");
		printlnOrder(root.right);

	}

}
