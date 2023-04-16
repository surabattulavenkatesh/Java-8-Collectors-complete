package JPMC;

class A1{
	
	void print() {
		System.out.println("Inside A print");
	}
}
class B1 extends A1{
	
	void print() {
		System.out.println("Inside B print");
	}
}
public class DynamicPoly{

	public static void main(String[] args) 
	{
		
		A1 a = new B1();//dynamically assigning the values
		
		a.print();
		print();
		

	}
	static void print() {
		
		System.out.println("Inside main method");
	}

}
