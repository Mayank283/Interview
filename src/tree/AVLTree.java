package tree;

/**
 * L-L Rotate 
 * L-R Rotate 
 * R-R Rotate
 * R-L Rotate
 */

public class AVLTree extends BinarySearchTree {

	public static BinaryTreeNode LeftSingleRotate(BinaryTreeNode root) {

		return root;
	}
	
	public static boolean AVLCheck(BinaryTreeNode root){
		if (root==null){
			return true;
		}
		if (Math.abs(BinaryTree.height(root.left)-(BinaryTree.height(root.right))) > 1){
			return false;
		}
		return (AVLCheck(root.left) && AVLCheck(root.right));
		
	}
}