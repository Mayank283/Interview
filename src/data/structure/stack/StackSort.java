package data.structure.stack;

import java.util.Stack;

/*
 * Sorting the stack in Ascending order
 * **/

public class StackSort {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(1);
		stack.push(6);
		stack.push(3);
		stack.push(2);
		stack.push(4);
		stack = sortingAscending(stack);

		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}

	public static Stack<Integer> sortingAscending(Stack<Integer> stack1) {

		Stack<Integer> stack2 = new Stack<Integer>();

		while (!stack1.isEmpty()) {

			int temp = stack1.pop();

			while (!stack2.isEmpty() && temp < stack2.peek()) {
				stack1.push(stack2.pop());
			}

			stack2.push(temp);
		}

		return stack2;
	}
}