package multithreading;

/**
 * Problem without static synchronization Suppose there are two objects of a
 * shared class(e.g. Table) named object1 and object2.In case of synchronized
 * method and synchronized block there cannot be interference between t1 and t2
 * or t3 and t4 because t1 and t2 both refers to a common object that have a
 * single lock. But there can be interference between t1 and t3 or t2 and t4
 * because t1 acquires another lock and t3 acquires another lock. I want no
 * interference between t1 and t3 or t2 and t4.Static synchronization solves
 * this problem.
 */

class tableobject {
	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

public class SynchroStatic {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				tableobject.printTable(1);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				tableobject.printTable(10);
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				tableobject.printTable(100);
			}
		};

		Thread t4 = new Thread() {
			public void run() {
				tableobject.printTable(1000);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}