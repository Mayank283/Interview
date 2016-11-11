package multithreading;


/**Join()- Method waits for a currently running thread to die
 * setName(),getName()- Set/get the name of the thread*/
public class MyJoin extends Thread{
	
	public void run(){
		for (int i = 0; i < 5; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	
	public static void main(String[] args) {
			MyJoin m1 = new MyJoin();
			MyJoin m2 = new MyJoin();
			MyJoin m3 = new MyJoin();
			m1.setName("Thread 1");
			m2.setName("Thread 2");
			m3.setName("Thread 3");
			m1.start();//Start internally calls the run method
			try {
				m1.join();
				//m1.join(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println("Resumed other threads once " + m1.getName()+" Executes Completely" );
			m2.start();
			m3.start();
	}

}
