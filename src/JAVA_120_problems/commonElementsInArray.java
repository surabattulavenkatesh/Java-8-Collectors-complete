package JAVA_120_problems;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class commonElementsInArray {

	public static void main(String[] args) {

		Integer[] arr1 = {1,2,3,4,5,6,7,8};
		Integer[] arr2 = {1,2,3,4,5,7,-1,0,-2};

//		Arrays.stream(arr1).filter(i -> Arrays.stream(arr2).noneMatch(j -> j == i)).distinct()
//				.forEach(System.out::println);
		
		
		Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().sorted(Entry.comparingByKey())
					.filter(i->i.getValue()==1).forEach(i->System.out.println(i.getKey()));
		
		Set<Integer> set = new TreeSet<>(Arrays.asList(arr1));
		for(Integer i : arr2) {
			if(!set.add(i)) {
				continue;
			}else {
				System.out.println(i);
			}
		}
		System.out.println(Arrays.toString(
		IntStream.rangeClosed('a'/'a', 'd').toArray()));

	}

}
