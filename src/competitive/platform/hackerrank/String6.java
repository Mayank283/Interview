package competitive.platform.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class String6 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		String[] result = new String[t];
		int i = 0;
		while (t-- > 0) {
			String s = in.nextLine();
			try {
				Pattern.compile(s);
				result[i++] = "Valid";
			} catch (PatternSyntaxException e) {
				result[i++] = "Invalid";
			}
		}
		in.close();
		for (String st : result)
			System.out.println(st);
	}
}