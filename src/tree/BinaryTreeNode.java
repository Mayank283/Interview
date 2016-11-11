package tree;

public class BinaryTreeNode {
	
	public BinaryTreeNode() {
	}

	public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, int data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}



	BinaryTreeNode left;
	BinaryTreeNode right;
	int data;

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}