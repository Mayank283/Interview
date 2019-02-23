package data.structure.tree;

/**
 * L-L Rotate
 * L-R Rotate
 * R-R Rotate
 * R-L Rotate
 */

public class AVLTree extends BinarySearchTree
{

    public static BinaryTreeNode LeftSingleRotate(BinaryTreeNode root)
    {

        return root;
    }

    public static boolean AVLCheck(BinaryTreeNode root)
    {
        if (root == null)
        {
            return true;
        }
        if (Math.abs(BinaryTree.height(root.getLeft()) - (BinaryTree.height(root.getRight()))) > 1)
        {
            return false;
        }
        return (AVLCheck(root.getLeft()) && AVLCheck(root.getRight()));

    }
}