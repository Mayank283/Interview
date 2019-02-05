package tree;

public class BinaryTreeTest
{

    public static void main(String[] args)
    {
        BinaryTreeNode node9 = new BinaryTreeNode(null, null, 9);
        BinaryTreeNode node8 = new BinaryTreeNode(null, null, 8);
        BinaryTreeNode node7 = new BinaryTreeNode(null, null, 7);
        BinaryTreeNode node6 = new BinaryTreeNode(null, null, 6);
        BinaryTreeNode node5 = new BinaryTreeNode(node8, node9, 5);
        BinaryTreeNode node4 = new BinaryTreeNode(null, null, 4);
        BinaryTreeNode node2 = new BinaryTreeNode(node4, node5, 2);
        BinaryTreeNode node3 = new BinaryTreeNode(node6, node7, 3);
        BinaryTreeNode root = new BinaryTreeNode(node2, node3, 1);
        //BinaryTree.preOrderIterative(root);
        //BinaryTree.levelOrderTraversal(root);
        BinaryTreeNode commonAncestor = BinaryTree.leastCommonAncestor(root, node8, node9);
        System.out.println(commonAncestor.getData());
    }
}