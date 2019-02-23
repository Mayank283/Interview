package language.java.multithreading;

/**
 * 3 constants defined in Thread class: 
 * a. public static int MIN_PRIORITY 
 * b. public static int NORM_PRIORITY 
 * c. public static int MAX_PRIORITY
 * 
 * Default Priority of a thread is 5 (NORM_PRIORITY). The value of
 * MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.
 * 
 * If the priority of a thread is not given then it takes the priority of the parent/calling thread.
 */

public class ThreadPriority extends Thread {
	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread ThreadPriority is:" + Thread.currentThread().getPriority());

	}

	public static void main(String args[]) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();//here priority of t3 will be same as of main thread which is 5 by default.
	}
}