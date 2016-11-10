package multithreading;

/**
 * Ways to create a thread
 * 1) Extend the thread class(itself implements the Runnable Interface)
 * 2) Implement the Runnable Interface
 * 
 * Thread class Methods
 ** start(),run(),sleep(),join(),yield(),suspend(),resume(),stop(),interupt()
 *
 * Runnable Interface method
 ** run()
 * 
 
Que)Can we start a thread twice?
Ans) No, IllegalthreadException
Que) What if we call run() method twice?
Ans) Nothing method is called in the same stack
*/ 
public class Myclass extends Thread{

	public void run(){
		for (int i = 0; i < 10; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Myclass m1 = new Myclass();
		Myclass m2 = new Myclass();
		//m1.start();
		//m.start();
		//m2.start();
		m1.run();
		m2.run();
	}

}
