/**
 * 
 */
package competitive.platform.codemonk;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author mayank
 *
 */
public class LastUniqueChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "naao";

		System.out.println(lastUniqueCharInString(s));

	}

	public static String lastUniqueCharInString(String s) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (map.get(s.charAt(i)) == null) {
				map.put(s.charAt(i), 1);
			}

			else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}

		System.out.println(map);

		return null;
	}
}