/**
 * 
 */
package multithreading;

/**
 * @author mayank
 *
 */
public class InterThreadCommTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterThreadComm i = new InterThreadComm();
		Thread t1 = new Thread(i);
		t1.start();
		Thread t2 = new Thread(i);
		t2.start();
	}
}