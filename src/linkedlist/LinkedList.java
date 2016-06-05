package linkedlist;

public class LinkedList {

	private ListNode Head;

	public ListNode insertEnd(ListNode node) {
		ListNode current = Head;
		if (Head == null) {
			Head = node;
		} else {
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(node);
		}
		return Head;
	}

	public void retrieve(ListNode Head) {

		ListNode current = Head;

		while (current != null) {
			System.out.print(current.getData() + "->");
			current = current.getNext();
		}
		System.out.println();
	}
}