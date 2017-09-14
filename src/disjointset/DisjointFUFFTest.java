/**
 * 
 */
package disjointset;

/**
 * @author agarwalm
 *
 */
public class DisjointFUFFTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DisjointFUFF disjointFUFF = new DisjointFUFF(6);
		disjointFUFF.makeSet();
		disjointFUFF.union(0, 1);
		disjointFUFF.union(2, 0);
		disjointFUFF.union(3, 1);
		disjointFUFF.union(4, 5);
		disjointFUFF.union(0, 4);
		disjointFUFF.displayArray();
		System.out.println(disjointFUFF.isConnected(3, 4));
	}
}
