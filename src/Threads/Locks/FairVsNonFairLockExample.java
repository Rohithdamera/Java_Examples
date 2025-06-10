package Threads.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairVsNonFairLockExample {
    private static Lock lock;

    public static void main(String[] args) {
        boolean fair = true;  // Change to false to see Non-Fair behavior
        lock = new ReentrantLock(fair);

        Runnable task = () -> {
            for (int i = 0; i < 2; i++) {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " acquired the lock");
                    try { Thread.sleep(100); } catch (InterruptedException e) { }
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
