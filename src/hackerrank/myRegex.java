package hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class myRegex {

	public static void main(String args[]) {
		//String pattern ="[0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}";
		String pattern =
				"^([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d?\\d|2[0-4]\\d|25[0-5])$";
		String str = "23.45.12.56";
		System.out.println(str.matches(pattern));
		// Pattern p = Pattern.compile(pattern);
		// Matcher m = p.matcher("172.16.28.11");
		// boolean b = m.matches();
		// System.out.println(b);
	}
}