package competitive.platform.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
	public static void main(String[] args) {

		String pattern = "\\b(\\w+)(\\s+\\1\\b)*";
		Pattern r = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String input = in.nextLine();
			Matcher m = r.matcher(input);
			while (m.find()) {
				// System.out.println("group ="+m.group());
				// System.out.println("group 1="+m.group(1));
				// System.out.println("group 2="+m.group(2));
				input = input.replaceAll("\\b"+m.group()+"\\b", m.group(1));
			}
			System.out.println(input);
			testCases--;
		}
		in.close();
	}
}