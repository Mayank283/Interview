package language.java.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    public static void main(String[] args) {

        CustomQueue customQueue = new CustomQueue(5);

        Consumer consumer = new Consumer(customQueue);
        Producer producer = new Producer(customQueue);
        Producer producer1 = new Producer(customQueue);

        producer.start();
        consumer.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producer1.start();
    }
}

class CustomQueue {
    private Queue<Integer> queue;
    private int size;
    private volatile int count = 0;

    public CustomQueue(int size) {
        queue = new LinkedList<>();
        this.size = size;
    }

    public synchronized void put(int number) throws InterruptedException {
        while (count == size) {
            this.wait();
        }
        queue.add(number);
        count++;
        this.notifyAll();
    }

    public synchronized int take() throws InterruptedException {
        while (count == 0) {
            this.wait();
        }
        count--;
        this.notifyAll();
        return queue.poll();
    }
}

class Producer extends Thread {

    private CustomQueue queue;

    public Producer(CustomQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private CustomQueue queue;

    public Consumer(CustomQueue queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
