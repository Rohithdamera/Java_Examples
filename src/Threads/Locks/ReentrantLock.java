//package Threads.Locks;
//
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//class BankAccount {
//    private int balance = 1000; // initial balance
//    private final Lock lock = new ReentrantLock();
//
//    // Method to deposit money
//    public void deposit(int amount) {
//        lock.lock();  // acquire the lock
//        try {
//            balance += amount;
//            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", New Balance: " + balance);
//        } finally {
//            lock.unlock();  // always unlock in finally block
//        }
//    }
//
//    // Method to withdraw money
//    public void withdraw(int amount) {
//        lock.lock();  // acquire the lock
//        try {
//            if (balance >= amount) {
//                balance -= amount;
//                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", New Balance: " + balance);
//            } else {
//                System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient funds.");
//            }
//        } finally {
//            lock.unlock();  // always unlock in finally block
//        }
//    }
//}
//
//public class ReentrantLock {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//
//        // Thread 1 - Deposits money
//        Thread t1 = new Thread(() -> {
//            account.deposit(500);
//            account.withdraw(700);
//        }, "Thread-1");
//
//        // Thread 2 - Withdraws money
//        Thread t2 = new Thread(() -> {
//            account.withdraw(300);
//            account.deposit(400);
//        }, "Thread-2");
//
//        t1.start();
//        t2.start();
//    }
//}
