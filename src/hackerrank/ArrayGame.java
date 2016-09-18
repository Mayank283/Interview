/**
 * 
 */
package hackerrank;

import java.util.Scanner;

/**
 * @author Mayank
 *
 */
public class ArrayGame {

	/**
	 * @param args
	 */
	static int m;
	static int n;
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		for (int i = 0; i < testcase; i++) {

			n = in.nextInt();
			m = in.nextInt();
			int[] array = new int[n];

			for (int j = 0; j < n; j++) {
				array[j] = in.nextInt();
			}
			int currentPosition = 0;
			int flag = 0;
			while (currentPosition < n) {
				try {
					if (array[currentPosition + m] == 0) {
						currentPosition = currentPosition + m;
						flag = 0;
					} else if (array[currentPosition + 1] == 0 && flag == 0) {
						currentPosition = currentPosition + 1;
						flag = 0;
					} else if (currentPosition !=0 && array[currentPosition - 1] == 0) {
						currentPosition = currentPosition - 1;
						flag = 1;
					} else {
						System.out.println("NO");
						break;
					}
				} catch (Exception e) {
					System.out.println("YES");
					break;
				}
			}
		}
		in.close();
	}
}