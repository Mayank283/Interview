package tree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {

		BinaryTreeNode root = null;
		root = BinarySearchTree.insert(root, 10);
		root = BinarySearchTree.insert(root, 12);
		root = BinarySearchTree.insert(root, 9);
		root = BinarySearchTree.insert(root, 8);
		root = BinarySearchTree.insert(root, 11);
		root = BinarySearchTree.insert(root, 13);
		// root = BinarySearchTree.insert(root,13);

		BinarySearchTree.inorderTraversal(root);

		System.out.println("Height" + BinarySearchTree.height(root));
		System.out.println("Tree is AVL " + AVLTree.AVLCheck(root));

		System.out.println(BinarySearchTree.search(root, 1));
		System.out.println(BinaryTree.search(root, 12));
		System.out.println(BinarySearchTree.findmax(root).getData());
		System.out.println(BinarySearchTree.findmin(root).getData());
	}
}