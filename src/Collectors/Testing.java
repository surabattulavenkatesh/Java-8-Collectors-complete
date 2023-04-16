package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Testing {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Ashwin","dhoni","virat","virat","Rohit");
		Map<Boolean, List<String>> collect = strings.stream()
				.collect(Collectors.partitioningBy(i->i.contains("virat")));
		System.out.println(collect.get(true));
		
		int[] arr = {3,2,1};
		int[] array = IntStream.rangeClosed(1, arr.length).map(i-> arr[arr.length-i]).toArray();
		System.out.println(Arrays.toString(array));
	}

}
