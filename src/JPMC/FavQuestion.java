package JPMC;

import java.util.stream.IntStream;

class imperative{
	
	volatile int sum;
	public  void sum1() {
		
		for(int i = 0; i<100000; i++) 
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	
}
class declartive{
	
		public void sum1() {
			int finSum= IntStream.rangeClosed(1,100000).sum();
			System.out.println(finSum);
		}
		
}
public class FavQuestion {

	public static void main(String[] args) throws InterruptedException {

		imperative i = new imperative();
		declartive d = new declartive();
		
		Thread t1 = new Thread(()->d.sum1());
		Thread t2 = new Thread(()->d.sum1());
		
		t1.start();
		t2.start();
		t1.join();
		t1.join();
		
	}

}
