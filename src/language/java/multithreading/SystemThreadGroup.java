/**
 * 
 */
package language.java.multithreading;

/**
 * @author mayank
 * Program to print all the System group threads running.
 */
public class SystemThreadGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		System.out.println(system.getName());
		System.out.println(system.activeCount());
		Thread [] t = new Thread[system.activeCount()];
		system.enumerate(t);
		system.list();
		
		for (Thread thread : t) {
			System.out.println(thread);
		}

	}

}
