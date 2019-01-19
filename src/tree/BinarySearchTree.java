package tree;

/**
 * Insert element 
 * Delete element 
 * find an element 
 * find max-element 
 * find min-element
 */

public class BinarySearchTree extends BinaryTree {

	// Recursive insert
	public static BinaryTreeNode insert(BinaryTreeNode root, int data) {

		if (root == null) {
			root = new BinaryTreeNode(null, null, data);
			return root;
		}
			if (data < root.getData()) {
				root.setLeft(insert(root.getLeft(), data));
			} else if (data > root.getData()) {
				root.setRight(insert(root.getRight(), data));
			}
		return root;
	}
	// Recursive search
	public static boolean search(BinaryTreeNode root, int data) {

		if (root==null){
			return false;
		}
		if (data > root.getData()) {
			return search(root.getRight(), data);
		}
		else if (data < root.getData()) {
			return search(root.getLeft(), data);
		}

		return true;
	}
	// Recursive findmax
	public static BinaryTreeNode findmax(BinaryTreeNode root){
		if(root==null){
			return null;
		}
		
		if(root.getRight()==null){
			return root;
		}
		else
			return findmax(root.getRight());
	}
	// Recursive findmin
	public static BinaryTreeNode findmin(BinaryTreeNode root){
		if (root == null){
			return null;
		}
		
		if(root.getLeft()==null){
			return root;
		}
		else
			return findmin(root.getLeft());
	}
}