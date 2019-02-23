package language.java.multithreading;

/**
 * @author mayank
 * 
 *         Remove comment section to break the deadlock. Here thread calling
 *         method1 has to sacrifice by waiting and releasing lock. 4 conditions
 *         leading to deadlock: 1. Mutual exclusion: Only one process at a time
 *         can use a resource(lock) 2. Hold & wait : A process may hold
 *         allocated resources while awaiting assignment of other resources. 3.
 *         No preemption: A resources can be released only voluntarily by the
 *         process holding it. 4. Circular wait.
 */
public class DeadlockObject {

	private String obj1 = "Lock1";

	private String obj2 = "Lock2";

	public void method1() {
		synchronized (obj1) {
			System.out.println(Thread.currentThread().getName() + " Acquire lock of method1 with Object1 as lock");

			// try {
			// obj1.wait();
			// } catch (InterruptedException e) {
			// e.printStackTrace();
			// }

			System.out.println("calling sync2 m1!!");
			synchronized (obj2) {
				System.out.println("Inside sync block 2 method1 " + Thread.currentThread().getName());
				obj2.notifyAll();
			}
		}
	}

	public void method2() {
		synchronized (obj2) {
			System.out.println(Thread.currentThread().getName() + " Acquire lock of method2 with Object2 as lock");

			System.out.println("calling sync2 m2!!");
			synchronized (obj1) {
				System.out.println("Inside sync block 2 method2 " + Thread.currentThread().getName());
				obj1.notifyAll();
			}
		}
	}
}
