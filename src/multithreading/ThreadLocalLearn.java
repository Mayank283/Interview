/**
 * 
 */
package multithreading;

/**
 * @author mayank
 *
 */
public class ThreadLocalLearn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int count = 0;

		// Inheritable threadlocal will be available to child threads
		InheritableThreadLocal<Integer> threadLocal = new InheritableThreadLocal<Integer>() {
			// Sets initial value of thread local
			public Integer initialValue() {
				return 7;
			}

			// Sets initial value of child threadlocal
			public Integer childValue(Integer n) {
				return 18;

			}
		};

		System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
		threadLocal.set(count++);
		System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
		threadLocal.remove();
		System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());

		Thread t1 = new Thread(new Runnable() {
			// Threadlocal value only for this thread
			ThreadLocal<Integer> thread = new ThreadLocal<Integer>();

			@Override
			public void run() {
				thread.set(5);
				System.out.println(Thread.currentThread().getName() + " " + thread.get());
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());

			}
		});
		t2.start();
	}
}