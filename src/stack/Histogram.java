package stack;

import java.util.Stack;

/** Maximum Rectangular area in histogram */

public class Histogram {

	public static void main(String[] args) {
		int area;
		int[] height = { 5, 6, 7, 8, 9, 10, 11, 12 };
		// area = maximumArea(height);
		area = MaxRectangleArea(height);
		System.out.println(area);
	}

	/** My Solution */
	public static int maximumArea(int[] a) {
		Stack<Integer> stack = new Stack<Integer>();
		int maxArea = 0, i = 0, count = 1, Area;

		if (a.length == 0)
			return 0;

		while (i < a.length) {

			if (stack.isEmpty() || a[i] > stack.peek())
				stack.push(a[i++]);

			else {

				while (!stack.isEmpty()) {

					Area = stack.pop() * (count++);

					if (Area > maxArea)
						maxArea = Area;
				}
				count = 1;
			}
		}

		while (!stack.isEmpty()) {

			Area = stack.pop() * (count++);

			if (Area > maxArea)
				maxArea = Area;
		}

		return maxArea;
	}

	/** Book Solution plays around storing the index */

	public static int MaxRectangleArea(int[] a) {

		Stack<Integer> stack = new Stack<Integer>();
		int maxArea = 0, i = 0;

		if (a.length == 0)
			return 0;

		while (i < a.length) {

			if (stack.isEmpty() || a[stack.peek()] <= a[i])
				stack.push(i++);

			else {
				int top = stack.pop();
				maxArea = Math.max(maxArea, a[top] * (stack.empty() ? i : i - stack.peek() - 1));
			}

		}

		while (!stack.empty()) {
			int top = stack.pop();
			maxArea = Math.max(maxArea, a[top] * (stack.empty() ? i : i - stack.peek() - 1));
		}

		return maxArea;
	}
}