package JPMC;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JPMCTest {

	public static void main(String[] args) {

		Integer[] arr = {1,2,3,4,5};
		
		Integer[] arr1 = IntStream.rangeClosed(1, arr.length).mapToObj(i->arr[arr.length-i]).toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(arr1));
		
		int range = 10;
		int n1 = 0; int n2 = 1; int next = 0;
		
		System.out.println(n1+" "+n2);
		for(int i = 2; i<range; i++) {
			
			System.out.println(n1);
			
			
			next = n1+n2;
			
			
			
		}
	}

}
