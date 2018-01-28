package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

	public static void main(String[] args) {

		TestClass test = new TestClass();

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

class TestClass {

	Lock lock = new ReentrantLock();

	public void method() {
		lock.lock();
		System.out.println(Thread.currentThread().getName() + " locked from this line going to sleep");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock.unlock();

		System.out.println(Thread.currentThread().getName() + " Upper part was locked hence landed up here!");

	}
}