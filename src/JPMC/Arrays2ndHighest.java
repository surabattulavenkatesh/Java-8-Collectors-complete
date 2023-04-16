package JPMC;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arrays2ndHighest {

	static int i = 10;
	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(10);
		list.add(30);
		
		list.stream().forEach(System.out::println);
		
		Integer[] arr = {4,2,6,3,7,5,4,2};
		Arrays.stream(arr).distinct().sorted().skip(1).limit(1).forEach((System.out::println));
	}
	/*
	 * 
	 
	delimeter//
	create procedure customers_procedure()
	begin
	some.some.complex query
	end//
	
	to call this using name : 
	call employee_procedure()
	*/

}
