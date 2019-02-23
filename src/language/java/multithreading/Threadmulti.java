/**
 * 
 */
package language.java.multithreading;

/**
 * @author mayank
 *
 *         Demo on creating threads in java by extending Thread class
 */
public class Threadmulti extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
