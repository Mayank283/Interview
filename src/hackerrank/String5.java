package hackerrank;

/**Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
 * We define a token to be one or more consecutive English alphabetic letters. 
 * Then, print the number of tokens, followed by each token on a new line.*/

//http://www.journaldev.com/634/regular-expression-in-java-regex-example
//http://www.ocpsoft.org/opensource/guide-to-regular-expressions-in-java-part-1/

import java.util.ArrayList;
import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		ArrayList<String> token = new ArrayList<String>();
		int a = 0,i;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
			} 
			else {
				if (a != i)
				token.add(s.substring(a, i));
				a = i + 1;
			}
		}
		
		if(a<i)
			token.add(s.substring(a, i));
		
		System.out.println(token.size());
		
		for (String t : token) {
			System.out.println(t);
		}
	}
}

/** String Tokens can be done using the split method of string class */
