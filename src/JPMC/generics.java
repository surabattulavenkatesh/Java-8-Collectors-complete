package JPMC;

import java.util.ArrayList;

public class generics {

	public static void main(String[] args) {

		Printer<Integer> p = new Printer<>(90);
		p.print();
		
		Printer<Double> p2 = new Printer<>(45.03);
		p2.print();
		
		ArrayList<Object> arrList = new ArrayList<>();
		arrList.add(new new Cat());
		//arrList.add(new new DOg());To acheive type safety , we need generics
		
		Cat myCat = (Cat)arrList.get(0);
		
		
		
	}

}
