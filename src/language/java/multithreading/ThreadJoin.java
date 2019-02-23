package language.java.multithreading;

/**
 * join()-> Calling thread waits for a currently running called thread to die.
 * setName(),getName()-> Set/get the name of the thread.
 */
public class ThreadJoin extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t1.start();// Start internally calls the run method
		try {
			t1.join();// Calling thread is main thread which waits until called thread t1 finishes
			// m1.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Resumed other threads once " + t1.getName() + " Executes Completely");
		t2.start();
		t3.start();
	}

}
