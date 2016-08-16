package hackerrank;

import java.util.Scanner;

public class String3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String result = "Yes";
		int left = 0;
		int right = a.length() - 1;

		while (left <= right) {
			if (a.charAt(left) != a.charAt(right))
				result = "No";
			left++;
			right--;
		}
		System.out.println(result);
		in.close();

		/** Single line solution */
		System.out.println(a.equals(new StringBuilder(a).reverse().toString()) ? "Yes" : "No");
	}
}