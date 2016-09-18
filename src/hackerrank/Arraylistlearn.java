/**
 * 
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Mayank
 *
 */
public class Arraylistlearn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

		int numberOfLine = in.nextInt();
		int numberOfElements;

		for (int i = 0; i < numberOfLine; i++) {
			a.add(new ArrayList<Integer>());
			numberOfElements = in.nextInt();
			for (int j = 0; j < numberOfElements; j++) {
				a.get(i).add(in.nextInt());
			}
		}

		int numberOfQuestion = in.nextInt();

		for (int i = 0; i < numberOfQuestion; i++) {
			int line = in.nextInt();
			int index = in.nextInt();
			try {
				System.out.println(a.get(line - 1).get(index - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
		in.close();
	}
}