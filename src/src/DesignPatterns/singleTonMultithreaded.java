package src.DesignPatterns;

public class singleTonMultithreaded {

	public static void main(String[] args) {

		new Thread(()->System.out.println(Boss.getInstance())).start();
		new Thread(()->System.out.println(Boss.getInstance())).start();
		new Thread(()->System.out.println(Boss.getInstance())).start();
		new Thread(()->System.out.println(Boss.getInstance())).start();
		new Thread(()->System.out.println(Boss.getInstance())).start();
		new Thread(()->System.out.println(Boss.getInstance())).start();
		new Thread(()->System.out.println(Boss.getInstance())).start();
		new Thread(()->System.out.println(Boss.getInstance())).start();
		
//		Boss obj1 = Boss.getInstance();
//		System.out.println(obj1);
//		Boss obj2 = Boss.getInstance();
//		System.out.println(obj2);
	}

}

class Boss{
	
	static Boss obj = new Boss();
	private Boss() {
		
	}
	
	public static Boss getInstance() {
		
		return obj;
	}
}
