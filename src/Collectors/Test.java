package Collectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		int sum = IntStream.rangeClosed(1, 7).sum();

		System.out.println(sum);

		int[] arr = { 1, 2, 3, 4, 5, 7 };

		System.out.println(Arrays.stream(arr).sum());

		String str = "AVAJ";
		String rev = Stream.of(str).map(i -> new StringBuilder(i).reverse().toString()).collect(Collectors.joining());

		System.out.println(rev);

		Map<String, Long> map = Stream.of(str.split("")).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(map);

		int[] arr1 = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
		System.out.println(Arrays.toString(arr1));

		Integer[] arr2 = { 1, 2, 3, 8 };

		Integer[] arr3 = IntStream.rangeClosed(1, arr2.length).mapToObj(i -> arr2[arr2.length - i])
				.toArray(i -> new Integer[i]);

		System.out.println(Arrays.toString(arr3));
	}

}
