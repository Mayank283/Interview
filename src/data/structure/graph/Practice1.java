/**
 * 
 */
package data.structure.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Mayank
 *
 */
public class Practice1 {

	/**
	 * @param args
	 */
	private List<Integer> nodes = new ArrayList<Integer>();
	private static boolean[][] adjMatrix;

	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		Practice1 t = new Practice1();
		int n = in.nextInt();
		adjMatrix = new boolean[n][n];

		int m = in.nextInt();
		for (int i = 0; i < m; i++) {
			t.addEdge(in.nextInt(), in.nextInt());
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println(t.isEdge(in.nextInt(), in.nextInt()));
		}
	}

	public void addEdge(int source, int destination) {
		if (!nodes.contains(source)) {
			nodes.add(source);
		}
		if (!nodes.contains(destination)) {
			nodes.add(destination);
		}
		adjMatrix[nodes.indexOf(source)][nodes.indexOf(destination)] = true;
		adjMatrix[nodes.indexOf(destination)][nodes.indexOf(source)] = true;
	}

	public String isEdge(int source, int destination) {

		if (adjMatrix[nodes.indexOf(source)][nodes.indexOf(destination)] == true) {
			return "YES";
		}
		return "NO";
	}
}
