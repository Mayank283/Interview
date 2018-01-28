package multithreading;

import java.util.concurrent.Semaphore;

/**
 * @author mayank
 * 
 *         Just like locks but provide access to shared resource to multiple
 *         threads at the same time. How many threads are to be permitted is
 *         based upon permits in constructor.
 *
 */
public class Semaphores {

	public static void main(String[] args) {

		TestSema test = new TestSema();

		Thread t1 = new Thread(() -> {
			test.method();
		});

		Thread t2 = new Thread(() -> {
			test.method();
		});
		t1.start();
		t2.start();
	}
}

class TestSema {

	Semaphore semaphore = new Semaphore(2);

	public void method() {

		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName() + " locked from this line going to sleep");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			 }
			System.out.println(Thread.currentThread().getName() + " Woke up from sleep!");
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} finally {
			semaphore.release();
		}
	}
}
