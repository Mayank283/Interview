package data.structure.stack;

import java.util.Stack;

@SuppressWarnings("serial")
public class AdvanceStack extends Stack<Object> {

	Stack<Integer> elementStack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();

	public void push(int data) {

		elementStack.push(data);

		if (minStack.isEmpty() || data < minStack.peek()) {
			minStack.push(data);
		}
	}

	public Integer pop() {

		if (elementStack.isEmpty())
			return null;
		

		if (minStack.peek() == elementStack.peek())
			minStack.pop();

		return elementStack.pop();
	}

	public Integer getMinimum() {
		return minStack.peek();
	}

	public static void main(String[] args) {

		AdvanceStack as = new AdvanceStack();

		as.push(15);
		as.push(20);
		as.push(10);
		System.out.println(as.getMinimum());
		System.out.println(as.pop());
		System.out.println(as.getMinimum());
		System.out.println(as.pop());
		System.out.println(as.pop());
		System.out.println(as.pop());
	
	}
}
