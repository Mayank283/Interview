package generics;

public class LinkedList<E> {

	Node<E> head;

	public LinkedList() {
		head = null;
	}

	public void add(E data) {
		Node<E> node = new Node<E>();
		node.setData(data);
		node.setNext(head);
		head = node;
	}

	public void get() {
		while (head != null) {
			System.out.println(head.getData());
			head = head.getNext();
		}
	}
}
