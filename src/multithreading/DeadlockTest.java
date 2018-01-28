
package multithreading;

/**
 * @author mayank
 *
 */
public class DeadlockTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DeadlockObject ob = new DeadlockObject();

		Thread thread1 = new Thread(() -> {
			ob.method1();
		});
		
		Thread thread2 = new Thread(() -> {
			ob.method2();
		});

		thread1.start();
		thread2.start();

	}
}