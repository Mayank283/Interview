package data.structure.linkedlist;

public class LinkedList
{

    private Node head;

    public Node insertEnd(Node node)
    {
        Node current = head;
        if (head == null)
        {
            head = node;
        } else
        {
            while (current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(node);
        }
        return head;
    }

    public Node insertBegin(Node node)
    {
        if (head == null)
        {
            head = node;
        } else
        {
            node.setNext(head);
            head = node;
        }
        return head;
    }

    public void display(Node head)
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.getData() + "->");
            current = current.getNext();
        }
        System.out.println();
    }
}