package stack;

public class StArray {

	private int top = -1;
	private int[] stack;
	private int size;

	public StArray() {

	}

	public StArray(int size) {
		this.size = size;
		this.stack = new int[size];
	}

	public void push(int data) {
		if (top == size)
			System.out.println("Stack is full");
		else
			stack[++top] = data;
	}

	public void pop() {
		if (top == -1)
			System.out.println("Stack is empty");
		else
			System.out.println(stack[top--]);
	}

	public void peek() {
		System.out.println(stack[top]);
	}
}