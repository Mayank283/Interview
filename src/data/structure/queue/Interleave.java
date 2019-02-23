package data.structure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
		System.out.println(q);
		q = interleave(q);
		System.out.println(q);
	}

	private static Queue<Integer> interleave(Queue<Integer> q) {

		Queue<Integer> q1 = new LinkedList<Integer>();
		if (q.size() % 2 != 0) {
			throw new IllegalStateException();
		}
		int size = q.size() / 2;
		for (int i = 0; i < size; i++) {
			q1.add(q.poll());
		}
		while (!q1.isEmpty()) {
			q.add(q1.poll());
			q.add(q.poll());
		}
		return q;
	}
}