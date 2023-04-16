package JPMC;

public class printEvenOddThreads {

	int count = 1;
	static int N;
	public static void main(String[] args) {

		N =10;
		printEvenOddThreads obj = new printEvenOddThreads();
		new Thread(()->obj.printEvenNums()).start();
		new Thread(()->obj.printOddNums()).start();
	}

	private  void printOddNums() {
		
		synchronized(this) {
			
			while(count < N) {
				
				while(count %2 == 0) {
					
					try {
						wait();
					}catch(Exception e){
						System.out.println("Exception inside odd nums");
					}
				}
				System.out.print(count + " ");
				count++;
				notify();
			}
		}
		
	}

	private void printEvenNums() {
		
		synchronized(this) {
			
			while (count < N) {

				while (count % 2 == 1) 
				{
					try {
						wait();
					}catch(Exception e) {
						System.out.println("Exception inside printEven number");
					}
				}
				System.out.print(count + " ");
				count++;
				notify();
			}
		}
		
	}

}
