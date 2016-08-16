package codemonk.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveLetter {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t;
		String badString;
		System.out.println("enter test cases");
		t = Integer.parseInt(in.readLine());
		String[] s = new String[t];

		while (t > 0) {
			badString = in.readLine();
			int i = 0, j = 0;
			String goodString=null;
			while (badString.length() - 1 > j) {
				j = i + 1;
				if (badString.charAt(i) != badString.charAt(j)) {
					goodString = goodString + badString.charAt(i++);
				} else
					i++;
			}

			t--;
		}
		for (String a : s) {
			System.out.println(a);
		}
	}
}