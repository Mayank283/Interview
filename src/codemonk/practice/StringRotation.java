/**
 * 
 */
package codemonk.practice;

/**
 * @author mayank
 *
 *         Program to check whether second string is a rotated String of 1 or
 *         not
 *
 */
public class StringRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(isRotated("waterbottle","erbottlewat"));
	}

	public static boolean isRotated(String s1, String s2) {

		s2 = s2 + s2;
		return s2.contains(s1) ? true : false;

	}
}
