package companies.oyo;

public class DeadLockExample {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public static void main(String[] args) {
        DeadLockExample deadLockExample = new DeadLockExample();
        Thread thread1 = new Thread(()->{
            deadLockExample.method1();
        });
        Thread thread2 = new Thread(()->{
            deadLockExample.method2();
        });

        thread1.start();
        thread2.start();
    }

    private void method1() {
        synchronized (lock1){
            System.out.println("Doing processing in method1...");
            System.out.println("Now Calling method3...");
            method3();
        }
    }

    private void method2()  {
        synchronized (lock2){
            System.out.println("Doing processing in method2...");
            System.out.println("Now Calling method4...");
            method4();
        }
    }

    private void method3(){
        synchronized (lock2){
            System.out.println("Called Method3...");
        }
    }

    private void method4(){
        synchronized (lock1){
            System.out.println("Called Method4...");
        }
    }
}