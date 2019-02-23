package companies.oyo;

import data.structure.tree.BinaryTreeNode;

/**
 *
 */
public class LeafNodeLTR
{
    public static void main(String[] args)
    {
        BinaryTreeNode node8 = new BinaryTreeNode(null, null, 8);
        BinaryTreeNode node7 = new BinaryTreeNode(null, null, 7);
        BinaryTreeNode node6 = new BinaryTreeNode(null, null, 6);
        BinaryTreeNode node5 = new BinaryTreeNode(null, node8, 5);
        BinaryTreeNode node4 = new BinaryTreeNode(null, null, 4);
        BinaryTreeNode node2 = new BinaryTreeNode(node4, node5, 2);
        BinaryTreeNode node3 = new BinaryTreeNode(node6, node7, 3);
        BinaryTreeNode root = new BinaryTreeNode(node2, node3, 1);

        System.out.println("Leaf Node left to right");
        LeafNodeLTR test = new LeafNodeLTR();
        test.leafNodeLeftToRight(root);
    }

    public void leafNodeLeftToRight(BinaryTreeNode root)
    {
        if (root != null)
        {
            if (root.getLeft() == null && root.getRight() == null)
            {
                System.out.print(root.getData() + " ");
                return;
            }
            leafNodeLeftToRight(root.getLeft());
            leafNodeLeftToRight(root.getRight());
        }
    }
}
