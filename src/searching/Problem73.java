/**
 * Maximum Difference between two elements such that larger element appears after smaller element
 * ex : [2,3,10,6,4,8,1] Ans:8 (10-2)
 * 		[7,9,5,6,3,2] Ans:2 (9-7)
 */
package searching;

import java.util.Stack;

/**
 * @author Mayank
 *
 */
public class Problem73 {

	/**
	 * Method 1 : Using Stacks
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 7, 9, 12, 10, 15, 2 };
		System.out.println(maximumDifference(array));

	}

	private static int maximumDifference(int[] array) {
		int diff = 0, i = 1;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(array[0]);
		while (i < array.length) {
			if (array[i] > stack.peek()) {
				if ((array[i] - stack.peek()) > diff) {
					diff = array[i] - stack.peek();
				}
			} else {
				stack.pop();
				stack.push(array[i]);
			}
			i++;
		}
		return diff;
	}
}