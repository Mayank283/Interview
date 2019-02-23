package data.structure.linkedlist;

public class LinkedListTest
{

    public static void main(String[] args)
    {
        Node head;

        LinkedList list = new LinkedList();

        Node node1 = new Node(15);

        Node node2 = new Node(20);

        Node node3 = new Node(25);

        Node node4 = new Node(30);

        Node node5 = new Node(35);

        System.out.println("Insert End test");
        list.insertEnd(node1);
        list.insertEnd(node2);
        list.insertEnd(node3);
        list.insertEnd(node4);
        head = list.insertEnd(node5);
        list.display(head);

        LinkedListTest test = new LinkedListTest();
        head = test.reverseRecursion(head);
        head = test.reverseIteration(head);
        list.display(head);
        head = test.rotateRight(head, 6);
        head = test.delAlternate(head);

        System.out.println("Insert Begin test");
        LinkedList list1 = new LinkedList();
        list1.insertBegin(new Node(5));
        list1.insertBegin(new Node(4));
        list1.insertBegin(new Node(3));
        list1.insertBegin(new Node(2));
        head = list1.insertBegin(new Node(1));
        list1.display(head);
    }

    /** Rotate right problem 57 */
    public Node rotateRight(Node Head, int k)
    {
        Node p = Head, q = Head;
        int i = 0;
        while (i != k)
        {
            q = q.getNext();

            if (q == null)
            {
                q = Head;
            }

            ++i;
        }

        if (p == q)
        {
            return Head;
        }

        while (q.getNext() != null)
        {
            q = q.getNext();
            p = p.getNext();
        }
        Node temp = p.getNext();
        q.setNext(Head);
        p.setNext(null);
        return temp;
    }

    public Node delAlternate(Node head)
    {
        Node p = head;
        Node q = head.getNext();
        Node temp;

        while (q != null)
        {

            p.setNext(q.getNext());
            temp = q;
            p = temp.getNext();

            if (q.getNext() != null)
            {
                q = q.getNext().getNext();
            } else
            {
                q = q.getNext();
            }

            temp.setNext(null);

        }
        return head;
    }

    public Node reverseRecursion(Node head)
    {
        if (head.getNext() == null)
        {
            return head;
        }
        Node head1 = reverseRecursion(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return head1;
    }

    public Node reverseIteration(Node head)
    {
        Node previous;
        Node current = head.getNext();
        head.setNext(null);
        while (current != null)
        {
            previous = head;
            head = current;
            current = head.getNext();
            head.setNext(previous);
        }
        return head;
    }
}