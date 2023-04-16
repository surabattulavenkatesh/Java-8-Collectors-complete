package JPMC;

import java.util.Random;
import java.util.function.Supplier;

public class RandomInteger {

	public static void main(String[] args) {

		Random r = new Random();
		Supplier<Integer>  supplier = ()->r.nextInt(100);
		
		for(int i =0; i<5; i++) {
			
			System.out.println(supplier.get());
			
		}
		r.ints(0,100).limit(5).forEach(System.out::print);
	}

}
/*
 * 		Supplier<String>  supplier1 = ()->"Venkatesh";
		System.out.println(supplier1.get());
		*/
