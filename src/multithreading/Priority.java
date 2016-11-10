package multithreading;

/**
 * 3 constants defiend in Thread class: a. public static int MIN_PRIORITY b.
 * public static int NORM_PRIORITY c. public static int MAX_PRIORITY
 * 
 * Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY
 * is 1 and the value of MAX_PRIORITY is 10.
 */

public class Priority extends Thread {
	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());

	}

	public static void main(String args[]) {
		Priority m1 = new Priority();
		Priority m2 = new Priority();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();

	}
}