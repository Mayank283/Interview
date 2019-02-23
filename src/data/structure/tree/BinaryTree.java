package data.structure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Methods of BinaryTree
 * a) insert node
 * b) delete node
 * c) Search element
 * d) find max element
 * e) find height of tree
 * f) Traversal
 * Preorder,Inorder,Postorder,LevelOrder
 */

public class BinaryTree
{

    // Preorder
    public static void preorderTraversal(BinaryTreeNode root)
    {
        if (root != null)
        {
            System.out.print(root.getData() + " ");
            preorderTraversal(root.getLeft());
            preorderTraversal(root.getRight());
        }
    }

    public static void preOrderIterative(BinaryTreeNode root)
    {
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node;
        stack.push(root);
        while (!stack.isEmpty())
        {
            node = stack.pop();
            System.out.print(node.getData() + " ");
            if (node.getRight() != null)
            {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null)
            {
                stack.push(node.getLeft());
            }
        }
    }

    // Inorder
    public static void inorderTraversal(BinaryTreeNode root)
    {
        if (root != null)
        {
            inorderTraversal(root.getLeft());
            System.out.print(root.getData() + " ");
            inorderTraversal(root.getRight());
        }
    }

    // Postorder
    public static void postorderTraversal(BinaryTreeNode root)
    {
        if (root != null)
        {
            postorderTraversal(root.getLeft());
            postorderTraversal(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }

    //PostOrder Iterative
    public static void postorderTraversalIterative(BinaryTreeNode root)
    {
    }

    public static void levelOrderTraversal(BinaryTreeNode root)
    {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode node;
        queue.offer(root);
        while (!queue.isEmpty())
        {
            node = queue.poll();
            if (node.getLeft() != null)
            {
                queue.offer(node.getLeft());
            }
            if (node.getRight() != null)
            {
                queue.offer(node.getRight());
            }
            System.out.print(node.getData() + " ");
        }
    }

    //Height
    public static int height(BinaryTreeNode root)
    {

        if (root == null)
        {
            return -1;
        }

        return Math.max(height(root.getLeft()), height(root.getRight())) + 1;
    }

    //Search in BinaryTree
    public static boolean search(BinaryTreeNode root, int data)
    {

        if (root == null)
        {
            return false;
        }

        if (data == root.getData())
        {
            return true;
        }

        return search(root.getLeft(), data) || search(root.getRight(), data);
    }

    public static BinaryTreeNode leastCommonAncestor(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2)
    {
        if (root == null)
        {
            return null;
        }
        if (root.getData() == node1.getData() || root.getData() == node2.getData())
        {
            return root;
        }

        BinaryTreeNode leftNode = leastCommonAncestor(root.getLeft(), node1, node2);
        BinaryTreeNode rightNode = leastCommonAncestor(root.getRight(), node1, node2);

        if (leftNode != null && rightNode != null)
        {
            return root;
        } else if (leftNode != null)
        {
            return leftNode;
        } else if (rightNode != null)
        {
            return rightNode;
        } else
        {
            return null;
        }
    }
}