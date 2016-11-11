package stack;

import java.util.Stack;

public class StaxDemo {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(15);
		s.push(78);
		System.out.print(s.search(15)+" ");
		System.out.print(s.size()+" ");
		System.out.print(s.pop()+" ");
		System.out.print(s.empty()+" ");
		System.out.print(s.peek()+" ");
		System.out.print(s.size()+" ");
		System.out.print(s.search(15));
	}
}