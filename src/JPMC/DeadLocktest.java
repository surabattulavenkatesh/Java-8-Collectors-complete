package JPMC;

public class DeadLocktest {
	
	private static String lock1 = new String();
	private static String lock2 = new String();
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		
		
	}
	
	private static class Thread1 extends Thread{
		@Override
		public void run() {
			
			synchronized(lock1) {
				
				System.out.println("Thread1 is holding Lock1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println("Thread1 is trying to obtain Lock 2");
				synchronized(lock2) {
					System.out.println("Thread1 is holding lock2");
					
				}
				
			}
			
		}
		
	}
	
		private static class Thread2 extends Thread{
		
		@Override
		public void run() {
			
			synchronized(lock2) {
				
				System.out.println("Thread2 is holding Lock2");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println("Thread2 is trying to obtain Lock 1");
				synchronized(lock1) {
					
					System.out.println("Thread2 is holding lock1");
					
				}
				
			}
			
		}
		
	}
}


