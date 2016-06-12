package stack;

/** 
 * Check if an array of characters is palindrome using stack */

import java.util.Stack;

public class StackPalindrome {

	public static void main(String[] args) {

		char[] a = { 'b', 'f', 'c', 'X', 'c', 'f', 'a' };
		boolean decision = isPalindrome(a);
		System.out.println(decision);
	}

	private static boolean isPalindrome(char[] a) {
		Stack<Character> stack = new Stack<Character>();
		int i = 0;

		while (a[i] != 'X') {
			stack.push(a[i]);
			i++;
		}
		
		i++;
		
		while (i < a.length) {
			if (a[i] != stack.pop()) /**
										 * Search for negative cases more in if
										 * statement to save time
										 */
				return false;
			i++;
		}

		return true;
	}
}