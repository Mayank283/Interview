/**
 * 
 */
package multithreading;

/**
 * @author mayank
 * 
 *         Test class
 */
public class ThreadmultiTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Threadmulti t1 = new Threadmulti();
		t1.start();

		Threadmulti t2 = new Threadmulti();
		t2.start();
	}
}
