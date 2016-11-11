package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String a = in.next();
		String b = in.next();

		/** String to character array */
		char[] ar = a.toLowerCase().toCharArray();
		char[] br = b.toLowerCase().toCharArray();
		Arrays.sort(ar);                //Time complexity is O(nlogn)
		Arrays.sort(br);

		/** Utilizing arrays equals function */
		System.out.println(Arrays.equals(ar, br));

		a = String.valueOf(ar);
		b = String.valueOf(br);
		/** Character Array back to String */
		System.out.println(String.valueOf(ar).equals(String.valueOf(br)));

		in.close();
		
		//Time complexity can be reduced to O(n) by using Hashmap or XOR method;
	}
}