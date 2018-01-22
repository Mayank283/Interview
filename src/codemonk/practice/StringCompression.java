/**
 * 
 */
package codemonk.practice;

/**
 * @author mayank
 *
 */
public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String testString = "aabcccccaaa";
		System.out.println(compress(testString));
	}

	public static String compress(String s1) {

		StringBuilder s2 = new StringBuilder("");
		char c;
		int count = 1;

		for (int i = 0; i < s1.length(); i++) {
			c = s1.charAt(i);
			if (i < s1.length() - 1 && s1.charAt(i) == s1.charAt(i + 1)) {
				count++;
			} else {
				s2 = s2.append(c).append(count);
				count = 1;
			}
		}
		return s2.length() < s1.length() ? s2.toString() : s1;
	}
}
