package Collectors;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stringReverse {

	public static void main(String[] args) {

		String str = "Hello";
		int arr[] = { 1, 2, 3, 4, 5 };

		String rev = Stream.of(str).map(i -> new StringBuilder(i).reverse().toString()).collect(Collectors.joining());
		System.out.println(rev.length());

		Integer[] array = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).boxed()
				.toArray(i -> new Integer[i]);
		
		System.out.println(Arrays.toString(array));
	}

}
