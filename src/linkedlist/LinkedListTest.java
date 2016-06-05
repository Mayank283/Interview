package linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		ListNode Head;

		LinkedList link = new LinkedList();

		ListNode node1 = new ListNode(15);

		ListNode node2 = new ListNode(20);

		ListNode node3 = new ListNode(25);

		ListNode node4 = new ListNode(30);

		ListNode node5 = new ListNode(35);
		
		Head = link.insertEnd(node1);
		Head = link.insertEnd(node2);
		Head = link.insertEnd(node3);
		Head = link.insertEnd(node4);
		Head = link.insertEnd(node5);

		link.retrieve(Head);
		//Head = rotateRight(Head, 6);
		Head = delAlternate(Head);
		link.retrieve(Head);
	}

	/** Rotate right problem 57 */
	public static ListNode rotateRight(ListNode Head, int k) {
		ListNode p = Head, q = Head;
		int i = 0;
		while (i != k) {
			q = q.getNext();

			if (q == null) {
				q = Head;
			}

			++i;
		}

		if (p == q)
			return Head;

		while (q.getNext() != null) {
			q = q.getNext();
			p = p.getNext();
		}
		ListNode temp = p.getNext();
		q.setNext(Head);
		p.setNext(null);
		return temp;
	}
	
	public static ListNode delAlternate(ListNode head){
		ListNode p = head;
		ListNode q = head.getNext();
		ListNode temp;
		
		while (q!=null){
			
		p.setNext(q.getNext());
		temp = q;
		p=temp.getNext();
		
		if(q.getNext()!= null)
			q=q.getNext().getNext();
		else
			q=q.getNext();
		
		temp.setNext(null);
		
		}
		return head;
	}
}