package competitive.platform.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsecutiveLetter {
	// public static void main(String[] args) throws IOException {
	// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	// int t;
	// String badString;
	// t = Integer.parseInt(in.readLine());
	//
	// while (t > 0) {
	// badString = in.readLine();
	// int i = 0, j = 0;
	// String goodString = "";
	// while (badString.length() - 1 > j) {
	// j = i + 1;
	// if (badString.charAt(i) != badString.charAt(j)) {
	// goodString = goodString + badString.charAt(i++);
	// } else
	// i++;
	// }
	// System.out.println(goodString + badString.charAt(i));
	// t--;
	// }
	// }

	/** Done using regex pattern */
	public static void main(String[] args) {
		String pattern = "(\\w)(\\1)*";
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		int testCase = Integer.parseInt(in.nextLine());

		while (testCase > 0) {
			String input = in.nextLine();
			Matcher m = r.matcher(input);
			while (m.find()) {
				input = input.replaceAll(m.group(), m.group(1));
			}
			System.out.println(input);
			testCase--;
		}
		in.close();
	}
}