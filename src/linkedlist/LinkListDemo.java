package linkedlist;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		System.out.println(l.size());
		for (Integer integer : l) {
			System.out.print(integer + " ");
		}
	}
}