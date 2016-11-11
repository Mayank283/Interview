package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(15);
		q.add(20);
		System.out.println(q.poll());
	}

}