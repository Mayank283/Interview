package data.structure.stack;

import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(2);
		s.push(1);
		s.push(7);
		s.push(5);
		System.out.println(s);
		reverse(s);
		System.out.println(s);
	}

	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty())
			return;
		int data = stack.pop();
		reverse(stack);
		insertAtBottom(stack, data);
	}

	private static void insertAtBottom(Stack<Integer> stack, int data) {
		if (stack.isEmpty()) {
			stack.push(data);
			return;
		}
		int temp = stack.pop();
		insertAtBottom(stack, data);
		stack.push(temp);
	}
}