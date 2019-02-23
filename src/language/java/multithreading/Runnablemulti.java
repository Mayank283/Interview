/**
/**
 * Ways to create a thread
 * 1) Implement the Runnable Interface
 * 2) Extend the thread class(itself implements the Runnable Interface)
 * 
 * Runnable Interface method
 * run();
 *  
 * Thread class Methods
 * start(),run(),sleep(),join(),yield(),suspend(),resume(),stop(),interrupt()
 
Que) Can we start a thread twice?
Ans) No, IllegalthreadException
Que) What if we call run() method twice?
Ans) Nothing method is called in the same stack 
*/
package language.java.multithreading;

/**
 * @author mayank
 * 
 *         Demo of multithread using Runnable Interface
 */
public class Runnablemulti implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
