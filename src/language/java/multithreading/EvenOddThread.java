package language.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class EvenOddThread {

    public static void main(String[] args) {
        Number number = new Number();
/*        Thread t1 = new Thread(number, "odd");
        Thread t2 = new Thread(number, "even");
        t1.start();
        t2.start();*/

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(number);
        service.execute(number);
        service.shutdown();
    }
}

class Number implements Runnable {

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    private volatile int number = 1;

    @Override
    public void run() {
        lock.lock();
        try {
            while (number <= 10) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " " + number++);
                    condition.signalAll();
                    condition.await();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}