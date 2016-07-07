package tree;

/**
 * Methods of BinaryTree a) insert node b) delete node c) Search element d) find
 * max element e) find height of tree f) Traversal
 * Preorder,Inorder,Postorder,LevelOrder
 */

public class BinaryTree {

	// Preorder
	public static void preorderTraversal(BinaryTreeNode root) {
		if (root != null) {
			System.out.print(root.getData() + ' ');
			preorderTraversal(root.getLeft());
			preorderTraversal(root.getRight());
		}
	}

	// Inorder
	public static void inorderTraversal(BinaryTreeNode root) {
		if (root != null) {
			inorderTraversal(root.getLeft());
			System.out.print(root.getData() + " ");
			inorderTraversal(root.getRight());
		}
	}

	// Postorder
	public static void postorderTraversal(BinaryTreeNode root) {
		if (root != null) {
			postorderTraversal(root.getLeft());
			postorderTraversal(root.getRight());
			System.out.print(root.getData() + ' ');
		}
	}
}