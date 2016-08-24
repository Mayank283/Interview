package stack;

import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
		s.push(7);
		s.push(1);
		s.push(2);
		reverse(s);
	}

	public static void reverse(Stack<Integer> stack) {
		if (!stack.isEmpty())
			return;
		int temp = stack.pop();
		reverse(stack);
		insertAtBottom(stack, temp);
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