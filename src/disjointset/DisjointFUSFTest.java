/**
 * 
 */
package disjointset;

/**
 * @author agarwalm
 *
 */
public class DisjointFUSFTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DisjointFUSF disjointFUSF = new DisjointFUSF(6);

		disjointFUSF.makeSet();
		disjointFUSF.union(0, 1);
		disjointFUSF.union(2, 0);
		disjointFUSF.union(4, 5);
		disjointFUSF.union(3, 1);
		System.out.println(disjointFUSF.find(3));
		System.out.println(disjointFUSF.find(2));
		System.out.println(disjointFUSF.find(4));
		System.out.println(disjointFUSF.isConnected(2, 3));
		System.out.println(disjointFUSF.isConnected(2, 4));
		System.out.println(disjointFUSF.isConnected(4, 5));
		disjointFUSF.displayArray();
	}

}
