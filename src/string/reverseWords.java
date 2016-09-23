package string;

public class reverseWords {

	public static void main(String[] args) {

		String s = "This is a Career Monk String";
		System.out.println(reverseSentence(s));
	}

	private static String reverseSentence(String s) {

		if (s.length() == 0) {
			return " ";
		}

		StringBuilder str = new StringBuilder();
		int length = s.length();
		int last = length;

		for (int i = length - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ' || i == 0) {
				if (i == 0) {
					str = str.append(s.substring(i, last) + " ");
				} else {
					str = str.append(s.substring(i + 1, last) + " ");
					last = i;
				}
			}
		}
		return str.toString();
	}
}