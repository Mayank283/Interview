/**
 * 
 */
package multithreading;

/**
 * @author mayank
 * 
 *         Test class
 */
public class RunnablemultiTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnablemulti(), "thread-1");
		t1.start();

		Thread t2 = new Thread(new Runnablemulti(), "thread-2");
		t2.start();
	}

}
