package hackerrank;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int k = in.nextInt();
		int i = 0;
		String smin = s.substring(i, k);
		String smax = s.substring(i, k);
		k++;
		i++;

		while (k < s.length() + 1) {

			smin = s.substring(i, k).compareTo(smin) < 0 ? s.substring(i, k) : smin;
			smax = s.substring(i, k).compareTo(smax) > 0 ? s.substring(i, k) : smax;
			k++;
			i++;
		}

		System.out.println(smin);
		System.out.println(smax);
		in.close();
	}
}