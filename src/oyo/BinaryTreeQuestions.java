package oyo;

import tree.BinaryTreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 */
public class BinaryTreeQuestions
{
    // ------------------------------------------------------------------------
    // methods
    // ------------------------------------------------------------------------
    public static void main(String[] args)
    {
        BinaryTreeNode eight = new BinaryTreeNode(null, null, 8);
        BinaryTreeNode seven = new BinaryTreeNode(null, null, 7);
        BinaryTreeNode six = new BinaryTreeNode(seven, eight, 6);
        BinaryTreeNode five = new BinaryTreeNode(null, null, 5);
        BinaryTreeNode four = new BinaryTreeNode(null, null, 4);
        BinaryTreeNode three = new BinaryTreeNode(null, six, 3);
        BinaryTreeNode two = new BinaryTreeNode(four, five, 2);
        BinaryTreeNode root = new BinaryTreeNode(two, three, 1);

        BinaryTreeQuestions binaryTreeQuestions = new BinaryTreeQuestions();
        //        binaryTreeQuestions.topViewOfBinaryTree(root);
        //        binaryTreeQuestions.verticalSum(root);
        //        binaryTreeQuestions.bottomViewOfBinaryTree(root);
        binaryTreeQuestions.minimumLevelLeafNodesSum(root);
    }

    private void topViewOfBinaryTree(BinaryTreeNode root)
    {
        if (root == null)
        {
            return;
        }
        Map<Integer, Integer> columnMap = new HashMap<>();
        Map<Integer, Integer> nodeVsColumnMap = new HashMap<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        columnMap.put(0, root.getData());
        nodeVsColumnMap.put(root.getData(), 0);

        while (!queue.isEmpty())
        {
            BinaryTreeNode node = queue.poll();

            if (node.getLeft() != null)
            {
                queue.offer(node.getLeft());
                Integer column = nodeVsColumnMap.get(node.getData()) - 1;
                nodeVsColumnMap.put(node.getLeft().getData(), column);
                if (columnMap.get(column) == null)
                {
                    columnMap.put(column, node.getLeft().getData());
                }
            }

            if (node.getRight() != null)
            {
                queue.offer(node.getRight());
                Integer column = nodeVsColumnMap.get(node.getData()) + 1;
                nodeVsColumnMap.put(node.getRight().getData(), column);
                if (columnMap.get(column) == null)
                {
                    columnMap.put(column, node.getRight().getData());
                }
            }
        }
        System.out.println(columnMap.values());
    }

    private void bottomViewOfBinaryTree(BinaryTreeNode root)
    {
        if (root == null)
        {
            return;
        }
        Map<Integer, Integer> columnMap = new HashMap<>();
        Map<Integer, Integer> nodeVsColumnMap = new HashMap<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode node;
        queue.offer(root);
        columnMap.put(0, root.getData());
        nodeVsColumnMap.put(root.getData(), 0);

        while (!queue.isEmpty())
        {
            node = queue.poll();

            if (node.getLeft() != null)
            {
                queue.offer(node.getLeft());
                Integer column = nodeVsColumnMap.get(node.getData()) - 1;
                nodeVsColumnMap.put(node.getLeft().getData(), column);
                columnMap.put(column, node.getLeft().getData());
            }

            if (node.getRight() != null)
            {
                queue.offer(node.getRight());
                Integer column = nodeVsColumnMap.get(node.getData()) + 1;
                nodeVsColumnMap.put(node.getRight().getData(), column);
                columnMap.put(column, node.getRight().getData());
            }
        }
        System.out.println(columnMap.values());
    }

    private void verticalSum(BinaryTreeNode root)
    {
        Map<Integer, Integer> columnMap = new HashMap<>();
        Map<Integer, Integer> nodeVsColumnMap = new HashMap<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        columnMap.put(0, root.getData());
        nodeVsColumnMap.put(root.getData(), 0);

        while (!queue.isEmpty())
        {
            BinaryTreeNode node = queue.poll();

            if (node.getLeft() != null)
            {
                queue.offer(node.getLeft());
                Integer column = nodeVsColumnMap.get(node.getData()) - 1;
                nodeVsColumnMap.put(node.getLeft().getData(), column);
                if (columnMap.get(column) == null)
                {
                    columnMap.put(column, node.getLeft().getData());
                } else
                {
                    columnMap.put(column, columnMap.get(column) + node.getLeft().getData());
                }
            }

            if (node.getRight() != null)
            {
                queue.offer(node.getRight());
                Integer column = nodeVsColumnMap.get(node.getData()) + 1;
                nodeVsColumnMap.put(node.getRight().getData(), column);
                if (columnMap.get(column) == null)
                {
                    columnMap.put(column, node.getRight().getData());
                } else
                {
                    columnMap.put(column, columnMap.get(column) + node.getRight().getData());
                }
            }
        }
        System.out.println(columnMap.values());
    }

    public void minimumLevelLeafNodesSum(BinaryTreeNode root)
    {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode node;
        int sum = 0;
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty())
        {
            node = queue.poll();
            if (node != null)
            {
                if (node.getLeft() == null && node.getRight() == null)
                {
                    sum = sum + node.getData();
                }
                if (node.getLeft() != null)
                {
                    queue.offer(node.getLeft());
                }
                if (node.getRight() != null)
                {
                    queue.offer(node.getRight());
                }
                if (queue.size() != 1 && queue.peek() == null)
                {
                    queue.offer(null);
                }
            } else if (sum != 0)
            {
                System.out.print(sum);
                return;
            }
        }
    }
}