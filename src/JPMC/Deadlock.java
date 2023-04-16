package JPMC;

public class Deadlock {
	 
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
 
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
 
    private static class Thread1 extends Thread {
 
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread1 is holding lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
 
                }
 
                System.out.println("Thread1 is trying to obtain lock2...");
                synchronized (lock2) {
                    System.out.println("Thread1 is holding lock2");
                }
            }
        }
    }
 
    private static class Thread2 extends Thread {
 
        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread2 is holding lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
 
                }
 
                System.out.println("Thread2 is trying to obtain lock1...");
                synchronized (lock1) {
                    System.out.println("Thread2 is holding lock1");
                }
            }
        }
    }
}
