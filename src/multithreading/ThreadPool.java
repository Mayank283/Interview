package multithreading;

import java.util.concurrent.*;

/**
 * @author mayank
 * <p>
 * Executor framework(ThreadPool framework) for creating ThreadPool.
 * Implementation of ExecutorService: 1. ThreadPoolExecutor 2.
 * ScheduledThreadPoolExecutor. Why create fresh threads again and again
 * when we can have Pool of already created threads and utilize them
 */
public class ThreadPool {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside execute " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Future<?> f1 = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task initiated! " + Thread.currentThread().getName());
            }
        });
        System.out.println(f1.get());// contains null since the task is executed completely

        Future<String> f = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Hello from " + Thread.currentThread().getName());
                return "Harry";
            }
        });
        System.out.println(f.get());

        // This step is important as otherwise it will keep jvm running(anantKaal tak)
        executorService.shutdown();
    }
}