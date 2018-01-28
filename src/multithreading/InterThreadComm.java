/**
 * 
 */
package multithreading;

/**
 * @author mayank
 *
 */
public class InterThreadComm implements Runnable {

	boolean flag = true;

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			synchronized (this) {
				System.out.println(i);
				if (flag) {
					try {
						flag = false;
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					this.notifyAll();
				}
			}
		}
	}
}
