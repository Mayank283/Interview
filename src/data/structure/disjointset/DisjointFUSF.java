/**
 * 
 */
package data.structure.disjointset;

/**
 * Implementation of Disjoint set for Fast Union Slow Find.
 * 
 * @author agarwalm
 *
 */
public class DisjointFUSF {

	int[] arr;
	int size;

	/**
	 * @param size
	 *            -> number of elements/nodes in the DS
	 */
	public DisjointFUSF(int size) {
		super();
		this.size = size;
	}

	/**
	 * Creates n disjoint sets each having only one node/element
	 */
	public void makeSet() {
		this.arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = i;
		}
	}

	/**
	 * @param x
	 *            -> Element/node whose root is to be calculated
	 * @return Root of the element
	 */
	public int find(int x) {

		while (arr[x] != x) {
			x = arr[x];
		}

		return arr[x];
	}

	/**
	 * @param x
	 *            -> first value/node to put in a set
	 * @param y
	 *            -> second value/node to put in a set
	 * 
	 */
	public void union(int x, int y) {
		if (find(x) == find(y)) {
			return;
		}

		if (!(x >= 0 && x < size) && (y >= 0 && y < size)) {
			return;
		}
		int root_x = find(x);
		int root_y = find(y);
		arr[root_x] = root_y;
	}

	/**
	 * @param x
	 *            -> First node
	 * @param y
	 *            -> Second node
	 * @return true if both the nodes are connected/member of same set
	 */
	public Boolean isConnected(int x, int y) {

		return find(x) == find(y) ? true : false;

	}

	public void displayArray() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
