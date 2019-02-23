package language.java.multithreading;

/**
 * Synchronization in java is the capability to control the access of multiple
 * threads to any shared resource.
 * 
 * Synchronization in thread can be achieved by:
 * 1. Synchronized Method (Object level lock is acquired in this)
 * 2. Synchronized Block (locks available this,object and classname.class)
 * 3. Static Synchronization(class level lock is acquired in this)
 * 
 * Synchronization is based on the concepts of locks: Synchronization is built
 * around an internal entity known as the lock or monitor. Every object has
 * lock associated with it. By convention, a thread that needs consistent access
 * to an "OBJECT'S FIELDS" has to acquire the object's lock before accessing
 * them, and then release the lock when it's done with them. From Java 5 the
 * package java.util.concurrent.locks contains several lock implementations.
 */

// Object having resource to be used by multiple threads
class Table {

	// synchronized method only this method is synchronized
	synchronized void printTable(int n) { 
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadSynchro {
	public static void main(String[] args) {
		final Table table = new Table();

		Thread t1 = new Thread() {

			public void run() {
				table.printTable(5);
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				table.printTable(100);
			}
		};

		t1.start();
		t2.start();

	}
}